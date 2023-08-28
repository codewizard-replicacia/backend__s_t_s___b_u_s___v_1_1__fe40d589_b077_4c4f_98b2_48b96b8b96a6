package com.apps.sts.function;

import com.apps.sts.model.Bus;
import com.apps.sts.model.Route;
import com.apps.sts.model.Driver;
import com.apps.sts.model.Trip;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.sts.repository.BusRepository;
import com.apps.sts.repository.TripRepository;
import com.apps.sts.repository.DriverRepository;
import com.apps.sts.repository.RouteRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
