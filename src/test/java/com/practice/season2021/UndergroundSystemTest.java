package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class UndergroundSystemTest {

    @Test
    public void getAverageTime() {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        double ans = 0;
        ans = undergroundSystem.getAverageTime("Paradise", "Cambridge");       // 返回 14.0。从 "Paradise"（时刻 8）到 "Cambridge"(时刻 22)的行程只有一趟
        System.out.println(ans);
        ans = undergroundSystem.getAverageTime("Leyton", "Waterloo");          // 返回 11.0。总共有 2 躺从 "Leyton" 到 "Waterloo" 的行程，编号为 id=45 的乘客出发于 time=3 到达于 time=15，编号为 id=27 的乘客于 time=10 出发于 time=20 到达。所以平均时间为 ( (15-3) + (20-10) ) / 2 = 11.0
        System.out.println(ans);
        undergroundSystem.checkIn(10, "Leyton", 24);
        ans = undergroundSystem.getAverageTime("Leyton", "Waterloo");          // 返回 11.0
        System.out.println(ans);
        undergroundSystem.checkOut(10, "Waterloo", 38);
        ans = undergroundSystem.getAverageTime("Leyton", "Waterloo");          // 返回 12.0
        System.out.println(ans);

        System.out.println("============");

        undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(596854,"EQH524YN",13);
        undergroundSystem.checkIn(29725,"Y1A2ROGU",17);
        undergroundSystem.checkOut(596854,"8AYN1B7O",115);
        undergroundSystem.checkIn(579716,"EQH524YN",145);
        undergroundSystem.checkOut(579716,"8AYN1B7O",199);
        undergroundSystem.checkOut(29725,"8AYN1B7O",295);
        undergroundSystem.checkIn(939079,"16MTS56Z",371);
        ans = undergroundSystem.getAverageTime("EQH524YN", "8AYN1B7O");
        System.out.println(ans);

        ans = undergroundSystem.getAverageTime("Y1A2ROGU", "8AYN1B7O");
        System.out.println(ans);

        undergroundSystem.checkIn(697035,"EQH524YN",442);
        undergroundSystem.checkIn(90668,"Y1A2ROGU",508);

        ans = undergroundSystem.getAverageTime("EQH524YN","8AYN1B7O");
        System.out.println(ans);
    }
}