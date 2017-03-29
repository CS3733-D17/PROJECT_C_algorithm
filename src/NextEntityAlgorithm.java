import java.util.LinkedList;
import java.util.List;

/**
 * Created by paluro on 3/24/17.
 */
public class NextEntityAlgorithm {

    public List<Entity> ents;

    public NextEntityAlgorithm(List<Entity> entities) {
        this.ents = entities;

    }


    public List<Entity> runAlgorithm(Entity.BeverageType type) {

        List<Entity> out = new LinkedList<Entity>();//list for 10 most recent entities

        int k = 0;//index to initialize 10 entities in output list;
        System.out.println(ents.size());
        while(k<10){
            out.add(ents.get(k));//initialize first 10 elements of output list
            //ents.remove(k);
            k++;
        }

        int i=0;//index for ents
        int j = 0;//first index for the output list

        while (j < out.size()) {//search for the j'th index of output list
            i=0; //reset i index as zero
            while ((i<ents.size())) {//look through ents to find next most recent
                //if ((ents.get(i).type) == type) {
                    if (ents.get(i).date.compareTo(out.get(j).date)<=0){//i is more recent than j entity

                        Entity temp= out.get(j);
                        int indexOfElt = out.indexOf(ents.get(i));//hold index of entity being taken from ents list

                    //exchange entities from lists
                        out.remove(j);//remove entity at j'th index of output list
                        out.set(j, ents.get(i));//add entity to j'th index of output
                        ents.remove(i);
                        ents.set(i, temp);
                    }
                i++;// increment index of the next entity

            }
            j++;//increment index for the output list
        }
        return out;
    }}

