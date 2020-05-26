package pl.example.train.schedule.service;

import pl.example.train.schedule.model.RailConnection;
import pl.example.train.schedule.model.RailConnectionQuery;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@RequestScoped
public class RailConnectionService {

    @PersistenceContext
    private EntityManager em;

    public List<RailConnection> findConnections(RailConnectionQuery railConnectionQuery) {
        return em.createQuery("SELECT NEW pl.example.train.schedule.model.RailConnection(s.train.origin.name, " +
                "s.train.destination.name, s.departureTime, s.arrivalTime) " +
                "FROM Schedule AS s " +
                "WHERE s.train.origin.name = :origin " +
                "AND s.train.destination.name = :destination " +
                "AND s.departureTime BETWEEN :startDate AND :endDate", RailConnection.class)
                .setParameter("origin", railConnectionQuery.getOrigin())
                .setParameter("destination", railConnectionQuery.getDestination())
                .setParameter("startDate", railConnectionQuery.getStartDate())
                .setParameter("endDate", railConnectionQuery.getEndDate())
                .getResultList();
    }

}
