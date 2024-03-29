package com.realestate.site.models.post;





import com.realestate.site.models.post.enums.*;
import com.realestate.site.models.user.User;
import com.realestate.site.utils.FormatDateTime;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "posts")
public class Post {
    // TODO: 10.08.2019 номер телефона
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "post_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    @NotNull
    private User user;

    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
    private Set<Photo> photos;

    @Column(name = "title")
    private String title;
    @Column(name = "date_time")
    private String dateTime;
    @Column(name = "account_type")
    private AccountType accountType;
    @Column(name = "deal_type")
    private DealType dealType;
    @Column(name = "rent_type")
    private RentType rentType;
    @Column(name = "real_estate_type")
    private RealEstateType realEstateType;
    @Column(name = "living")
    private Living living;
    @Column(name = "commercial")
    private Commercial commercial;
    @Column(name = "district")
    private District district;
    @Column(name = "address")
    private String address;
    @Column(name = "building_type")
    private BuildingType buildingType;
    @Column(name = "description")
    private String description;
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "price")
    private int price;

    @Column(name = "communal_payments")
    private boolean communalPayments;

    @Column(name = "number_of_rooms")
    private NumberOfRooms numberOfRooms;

    @Column(name = "repairs")
    private Repairs repairs;

    @Column(name = "floor")
    private int floor;

    @Column(name = "square")
    private double square;

    @Column(name = "deposit")
    private int deposit;

    @Column(name = "furniture")
    private boolean furniture;

    @Column(name = "balcony")
    private boolean balcony;

    @Column(name = "loggia")
    private boolean loggia;

    @Column(name = "tv")
    private boolean tv;

    @Column(name = "phone")
    private boolean phone;

    @Column(name = "bath")
    private boolean bath;

    @Column(name = "shower")
    private boolean shower;

    @Column(name = "conditioner")
    private boolean conditioner;

    @Column(name = "internet")
    private boolean internet;

    @Column(name = "separate_bathroom")
    private boolean separateBathroom;

    @Column(name = "combined_bathroom")
    private boolean combinedBathroom;

    @Column(name = "lift")
    private boolean lift;


    public Post(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateTime() {
        return  FormatDateTime.getInstance().formattedDateTime(dateTime);
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public DealType getDealType() {
        return dealType;
    }

    public void setDealType(DealType dealType) {
        this.dealType = dealType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public RealEstateType getRealEstateType() {
        return realEstateType;
    }

    public void setRealEstateType(RealEstateType realEstateType) {
        this.realEstateType = realEstateType;
    }

    public Living getLiving() {
        return living;
    }

    public void setLiving(Living living) {
        this.living = living;
    }

    public Commercial getCommercial() {
        return commercial;
    }

    public void setCommercial(Commercial commercial) {
        this.commercial = commercial;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isCommunalPayments() {
        return communalPayments;
    }

    public void setCommunalPayments(boolean communalPayments) {
        this.communalPayments = communalPayments;
    }

    public NumberOfRooms getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(NumberOfRooms numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Repairs getRepairs() {
        return repairs;
    }

    public void setRepairs(Repairs repairs) {
        this.repairs = repairs;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isFurniture() {
        return furniture;
    }

    public void setFurniture(boolean furniture) {
        this.furniture = furniture;
    }


    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isLoggia() {
        return loggia;
    }

    public void setLoggia(boolean loggia) {
        this.loggia = loggia;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isPhone() {
        return phone;
    }

    public void setPhone(boolean phone) {
        this.phone = phone;
    }

    public boolean isBath() {
        return bath;
    }

    public void setBath(boolean bath) {
        this.bath = bath;
    }

    public boolean isShower() {
        return shower;
    }

    public void setShower(boolean shower) {
        this.shower = shower;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isSeparateBathroom() {
        return separateBathroom;
    }

    public void setSeparateBathroom(boolean separateBathroom) {
        this.separateBathroom = separateBathroom;
    }

    public boolean isCombinedBathroom() {
        return combinedBathroom;
    }

    public void setCombinedBathroom(boolean combinedBathroom) {
        this.combinedBathroom = combinedBathroom;
    }

    public boolean isLift() {
        return lift;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", user=" + user +
                ", photos=" + photos +
                ", title='" + title + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", accountType=" + accountType +
                ", dealType=" + dealType +
                ", rentType=" + rentType +
                ", realEstateType=" + realEstateType +
                ", living=" + living +
                ", commercial=" + commercial +
                ", district=" + district +
                ", address='" + address + '\'' +
                ", buildingType=" + buildingType +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", communalPayments=" + communalPayments +
                ", numberOfRooms=" + numberOfRooms +
                ", repairs=" + repairs +
                ", floor=" + floor +
                ", square=" + square +
                ", deposit=" + deposit +
                ", balcony=" + balcony +
                ", loggia=" + loggia +
                ", tv=" + tv +
                ", phone=" + phone +
                ", bath=" + bath +
                ", shower=" + shower +
                ", conditioner=" + conditioner +
                ", internet=" + internet +
                ", separateBathroom=" + separateBathroom +
                ", combinedBathroom=" + combinedBathroom +
                ", lift=" + lift +
                '}';
    }
}
