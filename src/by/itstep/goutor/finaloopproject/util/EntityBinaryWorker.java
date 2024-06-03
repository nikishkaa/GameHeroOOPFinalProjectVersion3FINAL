package by.itstep.goutor.finaloopproject.util;

import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.entity.npc.*;

import java.io.*;

import static by.itstep.goutor.finaloopproject.controller.Main.LOGGER;

public class EntityBinaryWorker implements Serializable {
    public static void serialize(String fileName, Group group) {
        Writer stream = null;
        try {

            stream = new BufferedWriter(new FileWriter(fileName));


            for (Entity entity : group.getEntity()) {
                serializeCommonAttribute(stream, entity);
                serializeHeroAttribute(stream, entity);
                serializeArcherAttribute(stream, entity);
                serializeKnightAttribute(stream, entity);
                serializeBossAttribute(stream, entity);
                serializeDragonAttribute(stream, entity);
                serializeHydraAttribute(stream, entity);

            }


        } catch (IOException exception) {
            System.out.println(exception);
            LOGGER.fatal(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.flush();
                    stream.close();
                }
            } catch (IOException exception) {
                System.out.println(exception);
                LOGGER.fatal(exception);
            }

        }
    }

    private static void serializeCommonAttribute(Writer stream, Entity entity) throws IOException {
        stream.write(entity.getClass() + "\n");
        stream.write(entity.getName() + "\n");
        stream.write(entity.isAlive() + "\n");
        stream.write(entity.getHealth() + "\n");
        stream.write(entity.getLevel() + "\n");
        stream.write(entity.getBaseDamage() + "\n");
    }

    private static void serializeHeroAttribute(Writer stream, Entity entity) throws IOException {
        if (entity instanceof Hero) {
            stream.write(((Hero) entity).getMana() + "\n");
            stream.write(((Hero) entity).getWallet() + "\n");
            stream.write(((Hero) entity).getSpecialDamage() + "\n");
            stream.write(((Hero) entity).getArtifactSlot() + "\n");
            stream.write(((Hero) entity).getArtifactDamage() + "\n");
            stream.write(((Hero) entity).getArtifact() + "\n");
            stream.write(((Hero) entity).getAbility() + "\n");
        }
    }

    private static void serializeArcherAttribute(Writer stream, Entity entity) throws IOException {
        if (entity instanceof Archer) {
            stream.write(((Archer) entity).getArcherDamage() + "\n");
        }
    }

    private static void serializeKnightAttribute(Writer stream, Entity entity) throws IOException {
        if (entity instanceof Knight) {
            stream.write(((Knight) entity).getKnightDamage() + "\n");
        }
    }

    private static void serializeBossAttribute(Writer stream, Entity entity) throws IOException {
        if (entity instanceof Boss) {
            stream.write(((Boss) entity).getSurvivability() + "\n");
        }
    }

    private static void serializeDragonAttribute(Writer stream, Entity entity) throws IOException {
        if (entity instanceof Dragon) {
            stream.write(((Dragon) entity).getFireDamage() + "\n");
            stream.write(((Dragon) entity).getFireRange() + "\n");
        }
    }

    private static void serializeHydraAttribute(Writer stream, Entity entity) throws IOException {
        if (entity instanceof Hydra) {
            stream.write(((Hydra) entity).getHeadCount() + "\n");
        }
    }

}
