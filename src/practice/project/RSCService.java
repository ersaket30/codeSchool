package practice.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RSCService {
    public static void main(String[] args) {
        Booking booking1 = new Booking("GAP","US","RTL","123");
        Booking booking2 = new Booking("GAP","US","RTL","12378");
        Booking booking3 = new Booking("GAP","US","ONL","1234");
        Booking booking4 = new Booking("BR","US","RTL","23435");
        Booking booking5 = new Booking("BR","CAN","ONL","6546");
        List<Booking> bookings = new ArrayList<>(Arrays.asList(booking1,booking2,booking3,booking4,booking5));
        Map<BMC,List<Booking>> myMap = groupCCIdsByBMC(bookings);
    }

    static class Booking {
        String brandCode;
        String ccId;

        public Booking(String brandCode, String marketCode, String channelCode, String ccId) {
            this.brandCode = brandCode;
            this.marketCode = marketCode;
            this.channelCode = channelCode;
            this.ccId = ccId;
        }

        String marketCode;
        String channelCode;

        public String getBrandCode() {
            return brandCode;
        }

        public String getMarketCode() {
            return marketCode;
        }

        public String getChannelCode() {
            return channelCode;
        }
    }

    static class BMC{
        private String brandCode;
        private String marketCode;
        private String channelCode;

        public BMC(String brandCode, String marketCode, String channelCode) {
            this.brandCode = brandCode;
            this.marketCode = marketCode;
            this.channelCode = channelCode;
        }

        @Override
        public boolean equals(Object ob){
            if(ob==this){
                return true;
            }
            if(!(ob instanceof BMC)){
                return false;
            }

            BMC bmc = (BMC) ob;
            return bmc.brandCode==this.brandCode && bmc.marketCode==this.marketCode
                    && bmc.channelCode==this.channelCode;
        }
        @Override
        public final int hashCode() {
            int result = 17;
            if(brandCode!=null){
                result = 31*result + brandCode.hashCode();
            }
            if(marketCode!=null){
                result = 31*result + marketCode.hashCode();
            }
            if(channelCode!=null){
                result = 31*result + channelCode.hashCode();
            }
            return result;
        }
    }

    private static Map<BMC,List<Booking>> groupCCIdsByBMC(List<Booking> bookings) {
        return bookings.stream().collect(Collectors.groupingBy(booking->new BMC(booking.getBrandCode()
                ,booking.getMarketCode(),booking.getChannelCode())));
    }
}
