CREATE TABLE public.vehiculos (
      veh_placa text NULL,
      veh_marca text NULL,
      veh_modelo numeric NULL,
      veh_precio numeric NULL,
      CONSTRAINT vehiculos_pk PRIMARY KEY (veh_placa)
);
