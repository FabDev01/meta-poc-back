package com.mballem.demoparkapi.web.dto.mapper;

import com.mballem.demoparkapi.web.dto.PageableDto;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class PageableMapper {

    public static PageableDto toDto (Page page){
        return new ModelMapper().map(page, PageableDto.class);
    }
}
