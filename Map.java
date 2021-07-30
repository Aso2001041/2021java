public class Map {
    private final int no_SHIP = 0;
    private final int SHIP = 1;
    private int[][] map;

    public Map(){
        ;
    }
    public void init(int mapSise){
        map = new int[mapSise][mapSise];
        for(int i= 0; i < mapSise; i++){
            for(int j = 0; j < mapSise; j++){
                map[i][j] = no_SHIP;
            }
        }
    }
    public boolean deployShip(Ship ship){
        int x = ship.getPosX();
        int y = ship.getPosY();

        if( x >= map.length || y >= map.length){
            return false;
        }

        if( map[x][y] != no_SHIP){
            return false;
        }
        map[x][y] = SHIP;
        return true;
    }
    public void clear(int x, int y){
        if( x >= map.length || y>= map.length){
            return;
        }
        map[x][y] = no_SHIP;
    }
}
