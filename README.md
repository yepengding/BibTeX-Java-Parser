# BibTeX Java Parser

A BitTeX parser implemented in Java based on the [BibTeX Grammar](https://github.com/yepengding/BibTeX-Grammar).

Transforming a BibTeX file to an object in memory or a semi-structured file on disk.

## Features

- [ ] Full entry types support
- [x] To an object of class `Bib`
- [x] To a JSON file
- [x] Library
- [ ] Standalone

## Demo

Input:

```
@article{ding_formalism-driven_2022,
	title = {Formalism-{Driven} {Development}: {Concepts}, {Taxonomy}, and {Practice}},
	volume = {12},
	copyright = {All rights reserved},
	issn = {2076-3417},
	url = {https://www.mdpi.com/2076-3417/12/7/3415},
	doi = {10.3390/app12073415},
	number = {7},
	journal = {Applied Sciences},
	author = {Ding, Yepeng and Sato, Hiroyuki},
	year = {2022},
}
```

Output:

```json
[
  {
    "id": "ding_formalism-driven_2022",
    "type": "article",
    "title": "Formalism-Driven Development: Concepts, Taxonomy, and Practice",
    "volume": "12",
    "copyright": "All rights reserved",
    "issn": "2076-3417",
    "url": "https://www.mdpi.com/2076-3417/12/7/3415",
    "doi": "10.3390/app12073415",
    "number": "7",
    "journal": "Applied Sciences",
    "author": "Ding, Yepeng and Sato, Hiroyuki",
    "year": "2022"
  }
]
```

Input:

```
@inproceedings{ding_dagbase_2020,
	title = {Dagbase: a decentralized database platform {Using} {DAG}-based consensus},
	copyright = {All rights reserved},
	isbn = {1-72817-303-5},
	booktitle = {2020 {IEEE} 44th {Annual} {Computers}, {Software}, and {Applications} {Conference} ({COMPSAC})},
	publisher = {IEEE},
	author = {Ding, Yepeng and Sato, Hiroyuki},
	year = {2020},
	pages = {798--807},
}
```

Output:

```json
[
  {
    "id": "ding_dagbase_2020",
    "type": "inproceedings",
    "title": "Dagbase: a decentralized database platform Using DAG-based consensus",
    "copyright": "All rights reserved",
    "isbn": "1-72817-303-5",
    "booktitle": "2020 IEEE 44th Annual Computers, Software, and Applications Conference (COMPSAC)",
    "publisher": "IEEE",
    "author": "Ding, Yepeng and Sato, Hiroyuki",
    "year": "2020",
    "pages": "798--807"
  }
]
```

## Build

Environment

- Java 17
- Maven 3.8.1

Command

```shell
mvn clean compile assembly:single
```

## Usage

### As a Library

Get `Bib` object.

```
BibTeXParser bibTeXParser = new BibTeXParser();
Bib bib = bibTeXParser.parse(filePath);
```

Generate JSON to console.

```
JSONGenerator jsonGenerator = new JSONGenerator(bib);
jsonGenerator.generateToConsole();
```

## Related Project

- [BibTeX Grammar](https://github.com/yepengding/BibTeX-Grammar)