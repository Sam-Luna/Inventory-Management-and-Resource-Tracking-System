package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        /*Sample inventory that only works if the repositories are empty.*/
        if(partRepository.count() == 0) {
            //creating objects from the InhousePart class
            InhousePart pcCase = new InhousePart();
            InhousePart cooler = new InhousePart();
            InhousePart monitor = new InhousePart();
            InhousePart keyboard = new InhousePart();
            InhousePart mouse = new InhousePart();
            InhousePart speakers = new InhousePart();

            /*initializing InhouseParts*/

            pcCase.setId(1);
            pcCase.setName("Lavender Case");
            pcCase.setPrice(193.99);
            pcCase.setInv(70);
            pcCase.setMinInv(1);
            pcCase.setMaxInv(100);
            partRepository.save(pcCase);

            cooler.setId(2);
            cooler.setName("Thermalight White RGB Cooler");
            cooler.setPrice(33.93);
            cooler.setInv(66);
            cooler.setMinInv(1);
            cooler.setMaxInv(100);
            partRepository.save(cooler);

            monitor.setId(3);
            monitor.setName("Purple 37in Monitor");
            monitor.setPrice(143.99);
            monitor.setInv(50);
            monitor.setMinInv(1);
            monitor.setMaxInv(100);
            partRepository.save(monitor);

            keyboard.setId(4);
            keyboard.setName("White & Purple AK980 Keyboard");
            keyboard.setPrice(193.99);
            keyboard.setInv(80);
            keyboard.setMinInv(1);
            keyboard.setMaxInv(100);
            partRepository.save(keyboard);

            mouse.setId(5);
            mouse.setName("White Ergonomic Mouse");
            mouse.setPrice(25.99);
            mouse.setInv(72);
            mouse.setMinInv(1);
            mouse.setMaxInv(100);
            partRepository.save(mouse);

            speakers.setId(6);
            speakers.setName("White SoundBar");
            speakers.setPrice(43.98);
            speakers.setInv(92);
            speakers.setMinInv(1);
            speakers.setMaxInv(100);
            partRepository.save(speakers);

            //objects created from OutsourcedParts
            OutsourcedPart motherboard = new OutsourcedPart();
            OutsourcedPart processor = new OutsourcedPart();
            OutsourcedPart graphicsCard = new OutsourcedPart();
            OutsourcedPart ram = new OutsourcedPart();
            OutsourcedPart ssd = new OutsourcedPart();
            OutsourcedPart powerSupply = new OutsourcedPart();

            /*Intializing OutsourcedParts*/

            motherboard.setId(7);
            motherboard.setName("B850 WIFI7");
            motherboard.setPrice(229.19);
            motherboard.setInv(92);
            motherboard.setMinInv(1);
            motherboard.setMaxInv(100);
            motherboard.setCompanyName("Gigabyte");
            outsourcedPartRepository.save(motherboard);

            processor.setId(8);
            processor.setName("Ryzen 5 9600X");
            processor.setPrice(181.97);
            processor.setInv(82);
            processor.setMinInv(1);
            processor.setMaxInv(100);
            processor.setCompanyName("AMD");
            outsourcedPartRepository.save(processor);

            graphicsCard.setId(9);
            graphicsCard.setName("9070XT 16GB");
            graphicsCard.setPrice(749.99);
            graphicsCard.setInv(92);
            graphicsCard.setMinInv(1);
            graphicsCard.setMaxInv(100);
            graphicsCard.setCompanyName("ASRock");
            outsourcedPartRepository.save(graphicsCard);

            ram.setId(10);
            ram.setName("Elite 32GB DDR5 Memory");
            ram.setPrice(434.99);
            ram.setInv(49);
            ram.setMinInv(1);
            ram.setMaxInv(100);
            ram.setCompanyName("Patriot Viper");
            outsourcedPartRepository.save(ram);

            ssd.setId(11);
            ssd.setName("990 EVO 2TB Solid State Drive");
            ssd.setPrice(209.99);
            ssd.setInv(99);
            ssd.setMinInv(1);
            ssd.setMaxInv(100);
            ssd.setCompanyName("Samsung");
            outsourcedPartRepository.save(ssd);

            powerSupply.setId(12);
            powerSupply.setName("RM850e ATX Power Supply");
            powerSupply.setPrice(134.82);
            powerSupply.setInv(85);
            powerSupply.setMinInv(1);
            powerSupply.setMaxInv(100);
            powerSupply.setCompanyName("Corsair");
            outsourcedPartRepository.save(powerSupply);
        }// end of IF statement

        //creating objects from the product class
        if(productRepository.count() == 0) {
            Product budgetPc = new Product("Budget PC", 1200.00, 30);
            productRepository.save(budgetPc);

            Product familyPc = new Product("Family PC", 1500.00, 30);
            productRepository.save(familyPc);

            Product professionalPc = new Product("Professional/Work PC", 1800.00, 30);
            productRepository.save(professionalPc);

            Product gamingPc = new Product("Gaming PC", 2100.00, 30);
            productRepository.save(gamingPc);

            Product elitePc = new Product("Elite PC", 2500.00, 30);
            productRepository.save(elitePc);
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
