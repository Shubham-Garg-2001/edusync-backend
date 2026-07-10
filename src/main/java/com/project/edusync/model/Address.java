package com.project.edusync.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "addresses", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "school_id", nullable = false, unique = true)
    private Long schoolId;

    @Column(name = "address_line_1", nullable = false)
    private String addressLine1;

    @Column(name = "city")
    private String city;

    @Column(name = "state_province", nullable = false)
    private String stateProvince;

    @Column(name = "country")
    private String country;

    @Column(name = "postal_code", nullable = false)
    private String postalCode;

}
