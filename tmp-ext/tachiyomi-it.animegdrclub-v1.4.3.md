# Extension Validation Report

- Extension: tachiyomi-it.animegdrclub-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 10
- Lint: 0
- Warnings: 1
- Skipped: 22
- Failed: 3
- Retry disposition: RETRY_WHEN
- Retry condition: HOST_RESOLVES: www.agcscanlation.itprogetto.php

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 726858430404746545
- Source name: Anime GDR Club
- Source language: it
- Selected manga input: popular offset 0: Absolute Duo (`.../progetto.php <redacted query values: nome>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 133 | Absolute Duo (`.../progetto.php <redacted query values: nome>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 8 | Mushoku Tensei - Isekai Ittara Honki Dasu (`.../progetto.php <redacted query values: nome>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Absolute Duo (`.../progetto.php <redacted query values: nome>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | java.net.UnknownHostException: www.agcscanlation.itprogetto.php | 1-10s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | java.net.UnknownHostException: www.agcscanlation.itprogetto.php: No address associated with hostname | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.net.UnknownHostException: www.agcscanlation.itprogetto.php | RETRY_WHEN | DNS_LOOKUP_FAILURE | HOST_RESOLVES: www.agcscanlation.itprogetto.php |
| chapters operation | ERROR | java.net.UnknownHostException: www.agcscanlation.itprogetto.php: No address associated with hostname | RETRY_WHEN | DNS_LOOKUP_FAILURE | HOST_RESOLVES: www.agcscanlation.itprogetto.php |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 133 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Absolute Duo, URL=`progetto.php?nome=absolute` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 3 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 142/142 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 142/142 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `http://www.agcscanlation.it/.../houseki.jpg` -> 2 manga URLs (examples: `progetto.php?nome=houseki`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../skeleton.jpg` -> 2 manga URLs (examples: `progetto.php?nome=skeleton`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../slow.jpg` -> 2 manga URLs (examples: `progetto.php?nome=slow`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../mushoku.jpg` -> 2 manga URLs (examples: `progetto.php?nome=mushoku`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../sentouin.jpg` -> 2 manga URLs (examples: `progetto.php?nome=sentouin`, `.../progetto.php <redacted query values: nome>`) |  |  |  |
| thumbnail | PASS | `http://www.agcscanlation.it/.../absolute.jpg` (image/jpeg, 298779 bytes, 477x650) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
