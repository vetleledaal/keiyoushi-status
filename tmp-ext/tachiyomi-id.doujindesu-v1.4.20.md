# Extension Validation Report

- Extension: tachiyomi-id.doujindesu-v1.4.20
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7704282043609669342
- Source name: Doujindesu
- Source language: id
- Selected manga input: latest offset 0: Natsu to Inaka to Yuuwaku shite kuru Dekkai Oshiego (`.../natsu-to-inaka-to-yuuwaku-shite-kuru-dekkai-oshiego`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | A Wonderful New World (`.../a-wonderful-new-world`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Stepmother’s Friends (`.../stepmothers-friends`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Natsu to Inaka to Yuuwaku shite kuru Dekkai Oshiego (`.../natsu-to-inaka-to-yuuwaku-shite-kuru-dekkai-oshiego`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Super de Genki ni Hataraku Hahaoya ga Hikikomori Musuko ni Tanetsuke Saremakutteita Hanashi (`.../super-de-genki-ni-hataraku-hahaoya-ga-hikikomori-musuko-ni-tanetsuke-saremakutteita-hanashi`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Natsu to Inaka to Yuuwaku shite kuru Dekkai Oshiego (`.../natsu-to-inaka-to-yuuwaku-shite-kuru-dekkai-oshiego`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Natsu to Inaka to Yuuwaku shite kuru Dekkai Oshiego (`.../natsu-to-inaka-to-yuuwaku-shite-kuru-dekkai-oshiego`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 4 | Chapter 1 (`.../be1567dd-f410-471b-a733-57b9db670086`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Natsu to Inaka to Yuuwaku shite kuru Dekkai Oshiego, URL=`.../natsu-to-inaka-to-yuuwaku-shite-kuru-dekkai-oshiego` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=The Owner of A Building, URL=`.../the-owner-of-a-building` at page 1 offset 14 and page 2 offset 4 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pic.desu.xxx/.../38c95f56-ee09-4857-bfdc-ca008c17dbdd.webp` (image/webp (encoding: lossy), 55738 bytes, 486x680) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../natsu-to-inaka-to-yuuwaku-shite-kuru-dekkai-oshiego` |  |  |  |
| details thumbnail URL | PASS | `https://pic.desu.xxx/.../38c95f56-ee09-4857-bfdc-ca008c17dbdd.webp` |  |  |  |
| details author | PASS | Mikemono Yuu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big Ass, Big Breast, Bikini, Blowjob, Cunnilingus, Defloration, Exhibitionism, Femdom, Footjob, Group, Handjob, Harem, Milf, Multi-work Series, Nakadashi, Oyakodon, Paizuri, School Uniform, Shota, Sole Female, Sole Male, Stocking, Swimsuit, Twintails, Virginity, X-ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tidak ada deskripsi yang tersedia bosque<br><br>**Tipe:** Doujinshi<br>**Group:** Sigma-Arts<br>**Karakter:** Tidak Diketahui<br>**Seri:** Original<br>**Judul Alternatif:** 夏と田舎と誘惑してくるでっかい教え子, Summertime in the Countryside With The Huge Student Seducing Me |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ch-img.desu.pics/.../xKBiFCSBUwLXtErM8wctJIIRGzNsU9.webp` (image/webp (container: extended), 167532 bytes, 992x1400) |  |  |  |
