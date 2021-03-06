package com.example.fly.alerts;

import com.example.fly.status.FlightStatus;
import com.example.fly.utils.Alert;
import com.example.fly.utils.AlertNotification;

public class ArrivalGateAlert implements Alert {

	public boolean changedStatus(FlightStatus oldStatus, FlightStatus newStatus) {
		return !oldStatus.getArrivalGate().equals(newStatus.getArrivalGate());
	}

	public AlertNotification getNotification(FlightStatus newStatus) {
		return new AlertNotification("La nueva puerta de arribo es: " + newStatus.getArrivalGate());
	}

}
