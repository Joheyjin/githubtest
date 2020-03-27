package com.example.hj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import net.daum.android.map.MapViewEventListener;
import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;



public class MainActivity extends AppCompatActivity {

    private Object mapPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //다음이 제공하는 MapView객체 생성 및 API Key 설정
        MapView mapView = new MapView(this);
        mapView.setDaumMapApiKey("068372a5b1b7ee72a98692daf2701a73");


        //xml에 선언된 map_view 레이아웃을 찾아온 후, 생성한 MapView객체 추가
        RelativeLayout mapViewContainer = (RelativeLayout) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);

        //카카오 공식
 /*       ViewGroup mapViewContainer = findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);

/*
        // 맵뷰이벤트감지
        mapView.setMapViewEventListener((MapViewEventListener) this); // this에 MapView.MapViewEventListener 구현.
        mapView.setPOIItemEventListener((MapView.POIItemEventListener) this);
        mapView.setOpenAPIKeyAuthenticationResultListener((MapView.OpenAPIKeyAuthenticationResultListener) this);
*/
       /* // 중심점 변경
        mapView.setMapCenterPoint(MapPoint.mapPointWithGeoCoord(36.652645, 127.495414), true);
        // 줌 레벨 변경
        mapView.setZoomLevel(7, true);*/

        // 중심점 변경 + 줌 레벨 변경
        mapView.setMapCenterPointAndZoomLevel(MapPoint.mapPointWithGeoCoord(36.652645, 127.495414), 2, true);
        // 줌 인
        mapView.zoomIn(true);
        // 줌 아웃
        mapView.zoomOut(true);

/*
        // 기본마커커
       MapPOIItem marker = new MapPOIItem();

        marker.setItemName("Default Marker");
        marker.setTag(0);
        marker.setMapPoint((MapPoint) mapPoint);
        marker.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        mapView.addPOIItem(marker);
*/



/*마커실패/*
        final MapPoint MARKER_POINT=null;
        void onPOIItemSelected(MapView mapView){
            MapPOIItem marker = new MapPOIItem();
            marker.setItemName("Default Marker");
            marker.setTag(0);
            marker.setMapPoint(MARKER_POINT);
            marker.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
            marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.

            mapView.addPOIItem(marker);
 */
        /*
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        intent.setData(Uri.parse("myapp://"));
        startActivity(intent);

        if(getIntent()!=null){
            Uri uri = getIntent().getData();
            if(uri != null)
            {
                String param1 = uri.getQueryParameter("param1");
                String param2 = uri.getQueryParameter("param2");
            }
        }
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("daummaps://route?sp=37.537229,127.005515&ep=37.4979502,127.0276368&by=FOOT"));
        startActivity(intent);

        }
*/


    }
}