# Extension Validation Report

- Extension: tachiyomi-en.kappabeast-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2598579144085032375
- Source name: Kappa Beast
- Source language: en
- Selected manga input: popular offset 0: 'Ano Toki Tasukete Itadaita Monster Musume desu.' Isekai Ossan Kyoushi Totsuzen no Moteki ni Konwaku suru (`.../ano-toki-tasukete-itadaita-monster-musume-desu-isekai-ossan-kyoushi-totsuzen-no-moteki-ni-konwaku-suru`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 'Ano Toki Tasukete Itadaita Monster Musume desu.' Isekai Ossan Kyoushi Totsuzen no Moteki ni Konwaku suru (`.../ano-toki-tasukete-itadaita-monster-musume-desu-isekai-ossan-kyoushi-totsuzen-no-moteki-ni-konwaku-suru`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 5 | Ane Kui Yuusha to Teisou Gyakuten Teikoku no Onee-chan! (`.../ane-kui-yuusha-to-teisou-gyakuten-teikoku-no-onee-chan`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Kiwamete KENZEN na Bishoujo Level Up
 (`.../Kiwamete-kenzen-na-bishoujo-level-up`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 5 | Sen’otome-tachi to Kizuku Moto-Teihen Murabito no Saikyō Hāremu: Sūmannin no Onna ni Taishi, Otoko wa Ore Hitori (`.../sen-otome-tachi-to-kizuku-moto-teihen-murabito-no-saikyo-haremu-sumannin-no-onna-ni-taishi-otoko-wa-ore-hitori`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 'Ano Toki Tasukete Itadaita Monster Musume desu.' Isekai Ossan Kyoushi Totsuzen no Moteki ni Konwaku suru (`.../ano-toki-tasukete-itadaita-monster-musume-desu-isekai-ossan-kyoushi-totsuzen-no-moteki-ni-konwaku-suru`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 'Ano Toki Tasukete Itadaita Monster Musume desu.' Isekai Ossan Kyoushi Totsuzen no Moteki ni Konwaku suru (`.../ano-toki-tasukete-itadaita-monster-musume-desu-isekai-ossan-kyoushi-totsuzen-no-moteki-ni-konwaku-suru`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 66 | Chapter 1 - I am the Tako-ko from that time (`.../1.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 43 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title='Ano Toki Tasukete Itadaita Monster Musume desu.' Isekai Ossan Kyoushi Totsuzen no Moteki ni Konwaku suru, URL=`ano-toki-tasukete-itadaita-monster-musume-desu-isekai-ossan-kyoushi-totsuzen-no-moteki-ni-konwaku-suru#gq9zi3f1ll1xbc04y7hlctyz` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://strapi.kappabeast.com/.../monster_v4_1931251411.jpg` (image/jpeg, 400725 bytes, 1516x2189) |  |  |  |
| details identity | PASS | Details preserved selected URL `ano-toki-tasukete-itadaita-monster-musume-desu-isekai-ossan-kyoushi-totsuzen-no-moteki-ni-konwaku-suru#gq9zi3f1ll1xbc04y7hlctyz` |  |  |  |
| details thumbnail URL | PASS | `https://strapi.kappabeast.com/.../monster_v4_1931251411.jpg` |  |  |  |
| details author | PASS | Okinosuke |  |  |  |
| details artist | PASS | Okinosuke |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Some 20 years have passed since the protagonist was summoned to another world and retired from the army. He is still single in his 40s and lives as a low-ranking professor, until one day, an elite ‘monster girl’ transfers into his class. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 17 name, chapter 18 name |  |  |  |
| chapters | PASS | 66 chapters |  |  |  |
| chapter dates | PASS | 66 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../02.jpg` (image/jpeg, 1439604 bytes, 1975x2783) |  |  |  |
