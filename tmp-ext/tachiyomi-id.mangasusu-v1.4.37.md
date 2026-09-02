# Extension Validation Report

- Extension: tachiyomi-id.mangasusu-v1.4.37
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8157748444640827548
- Source name: Mangasusu
- Source language: id
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Water Overflow (`.../water-overflow`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Wireless Onahole (`.../wireless-onahole`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | KinkFolder.ZIP (`.../kinkfolder-zip`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 315 | Chapter 1 (`.../secret-class-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 23 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangasusuku.com/.../Secret-Class.jpg` (image/jpeg, 14000 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://mangasusuku.com/.../Secret-Class.jpg` |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Mina-chan |  |  |  |
| details genres | PASS | Adult, Drama, Harem, Manhwa, Romance, Seinen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dae Ho, yang menjadi yatim piatu pada usia 13 tahun, diadopsi oleh teman ayahnya. Namun, Dae Ho di masa dewasa tidak tahu apa-apa tentang hubungan antara pria dan wanita. Bibi dan saudari memutuskan untuk memberi Dae Ho yang murni kelas rahasia …<br><br>Alternative Names: 비밀수업, 秘密教學 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 315 chapters |  |  |  |
| chapter dates | PASS | 315 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.komikindo.info/.../1.jpg` (image/jpeg, 59325 bytes, 720x880) |  |  |  |
