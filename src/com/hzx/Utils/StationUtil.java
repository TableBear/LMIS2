package com.hzx.Utils;

import com.hzx.pojo.Station;
import com.hzx.service.Icon;
import com.hzx.service.StationJson;
import java.util.ArrayList;
import java.util.List;

public class StationUtil
{
  public static List<StationJson> stationsToJsons(List<Station> list)
  {
    ArrayList<StationJson> res = new ArrayList(list.size());
    for (int i = 0; i < list.size(); i++) {
      res.add(new StationJson(((Station)list.get(i)).getStationname(), ((Station)list.get(i)).getAddress() + "<br/>" + ((Station)list.get(i)).getTelephone(), ((Station)list.get(i)).getPoint(), 1, new Icon(25, 25, 0, 0, 6, 5)));
    }
    return res;
  }
  
  public static StationJson stationToJson(Station station)
  {
    if (station == null) {
      return null;
    }
    StationJson stationJson = new StationJson(station.getStationname(), station.getAddress() + "<br/>" + station.getTelephone(), station.getPoint(), 1, new Icon(25, 25, 0, 0, 6, 5));
    return stationJson;
  }
}
