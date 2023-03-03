/*
 *
 * * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.exchanges;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetRestaurantsRequest {

  @NotNull
  private double latitude;

  @NotNull
  private double longitude;

  private String searchFor;

  public GetRestaurantsRequest(double latitude, double longitude) {

    this.latitude = latitude;
    this.longitude = longitude;
  }


}

