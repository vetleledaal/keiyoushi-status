# Extension Validation Report

- Extension: tachiyomi-es.doujinhentai-v1.4.50
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
- Source ID: 3895171315878328595
- Source name: DoujinHentai
- Source language: es
- Selected manga input: latest offset 0: Hahaoya Yuuwaku ~Boku no Mama Ikusei Keikaku~ (`.../hahaoya-yuuwaku-boku-no-mama-ikusei-keikaku`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Big Ass - Milftoon (`.../big-ass-milftoon-`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 18 | Colección de doujins sin censura (`.../coleccin-de-doujins-sin-censura-`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Hahaoya Yuuwaku ~Boku no Mama Ikusei Keikaku~ (`.../hahaoya-yuuwaku-boku-no-mama-ikusei-keikaku`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | Suimin Rape (`.../suimin-rape`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Hahaoya Yuuwaku ~Boku no Mama Ikusei Keikaku~ (`.../hahaoya-yuuwaku-boku-no-mama-ikusei-keikaku`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Hahaoya Yuuwaku ~Boku no Mama Ikusei Keikaku~ (`.../hahaoya-yuuwaku-boku-no-mama-ikusei-keikaku`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo 1: Hahaoya Yuuwaku ~Boku no Mama Ikusei Keikaku~ (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 256 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hahaoya Yuuwaku ~Boku no Mama Ikusei Keikaku~, URL=`.../hahaoya-yuuwaku-boku-no-mama-ikusei-keikaku` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.zx89.site/.../cover_250x350.jpg` (image/jpeg, 1631876 bytes, 1057x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hahaoya-yuuwaku-boku-no-mama-ikusei-keikaku` |  |  |  |
| details thumbnail URL | PASS | `https://s4.zx89.site/.../cover_250x350.jpg` |  |  |  |
| details author | PASS | Hyji |  |  |  |
| details artist | PASS | Hyji |  |  |  |
| details genres | PASS | Tetonas, Ahegao, Casadas, Mamadas, grandes pechos, big ass, blowjob, glasses, Lingerie, Masturbación, Milf, Cheating, Tankoubon, big-breasts |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 256 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s4.zx89.site/.../001.jpg` (image/jpeg, 1631876 bytes, 1057x1500) |  |  |  |
