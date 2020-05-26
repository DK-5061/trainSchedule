package pl.example.train.schedule;


import com.kumuluz.ee.discovery.annotations.RegisterService;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
@RegisterService("train-schedule")
public class TrainScheduleRestApplication extends Application {

}
