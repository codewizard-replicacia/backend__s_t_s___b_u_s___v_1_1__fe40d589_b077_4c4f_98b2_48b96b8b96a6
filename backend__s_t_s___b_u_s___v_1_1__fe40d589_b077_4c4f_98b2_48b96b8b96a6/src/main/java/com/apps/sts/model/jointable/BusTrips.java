package com.apps.sts.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.sts.model.Bus;
import com.apps.sts.model.Route;
import com.apps.sts.model.Driver;
import com.apps.sts.model.Trip;

@Entity(name = "BusTrips")
@Table(schema = "\"sts-v11\"", name = "\"BusTrips\"")
@Data
public class BusTrips{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"BusId\"")
	private Integer busId;

    
    @Column(name = "\"TripId\"")
    private Long tripId;
 
}