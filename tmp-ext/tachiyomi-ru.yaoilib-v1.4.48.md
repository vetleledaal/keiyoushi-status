# Extension Validation Report

- Extension: tachiyomi-ru.yaoilib-v1.4.48
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2730544188738947015
- Source name: SlashLib
- Source language: ru
- Selected manga input: latest offset 0: Our D-Days (`.../48639--nasi-d-dni`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | Secret Alliance (`.../23435--secret-alliance`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | success | 60 | The lady and the mermaid (`.../202211--la-dama-y-la-sirena`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 15 | Our D-Days (`.../48639--nasi-d-dni`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | The Invisible Man and His Soon-to-Be Wife (`.../110327--toumei-otoko-to-ningen-onna-sonouchi-fuufu-ni-naru-futari`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Our D-Days (`.../48639--nasi-d-dni`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Our D-Days (`.../48639--nasi-d-dni`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 45 | Том 1. Глава 1 (`.../chapter <redacted query values: , volume, and number>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | <1s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Our D-Days, URL=`.../48639--nasi-d-dni` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.cdnlibs.org/.../2W06WEL7baHO_250x350.jpg` (image/jpeg, 127435 bytes, 375x525) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../48639--nasi-d-dni` |  |  |  |
| details thumbnail URL | PASS | `https://cover.cdnlibs.org/.../2W06WEL7baHO_250x350.jpg` |  |  |  |
| details author | PASS | Omyo |  |  |  |
| details artist | PASS | Omyo |  |  |  |
| details genres | PASS | Манхва, 16+, Драма, Романтика, Сёдзё, Школа,  |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Наши Д-дни<br>★★★★✬ 9.2 (голосов: 74)<br>Альтернативные названия:<br>Gakjaui D-Day / When the Day Comes / その日がきたら僕たちは / 각자의 디데이<br><br>Мы находимся в отношениях, в которых мы якобы расстались, но на самом деле не расстались.Что будет с нами, если мы не будем правдивы?<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: genre, description |  |  |  |
| chapters | PASS | 45 chapters |  |  |  |
| chapter dates | PASS | 45 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | FAIL | 10 of 11 pages have invalid URLs: page 2: url=`.../001_sFq3.png` (protocol-relative URL), page 3: url=`.../002_ZWXI.png` (protocol-relative URL), page 4: url=`.../003_3l1M.png` (protocol-relative URL), page 5: url=`.../004_nA2v.png` (protocol-relative URL), page 6: url=`.../005_250G.png` (protocol-relative URL), and 5 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img3.hentaicdn.org/.../000_7Ip5.png` (image/jpeg, 951968 bytes, 2480x3508) |  |  |  |
