# Extension Validation Report

- Extension: tachiyomi-tr.averisfansub-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3678110616121957660
- Source name: Averis Fansub
- Source language: tr
- Selected manga input: popular offset 0: In Good Faith (`.../858`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | In Good Faith (`.../858`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | One-Room TA (`.../3152`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Backlight (`.../1795`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Addiction (`.../3676`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | In Good Faith (`.../858`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | In Good Faith (`.../858`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | 0. Prolog (`.../0-prolog`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=In Good Faith, URL=`858` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://averisfansub.site/.../0cf75590ca857551f7f5421b80cce4e7.jpg` (image/jpeg, 70738 bytes, 736x805) |  |  |  |
| details identity | PASS | Details preserved selected URL `858` |  |  |  |
| details thumbnail URL | PASS | `https://averisfansub.site/.../0cf75590ca857551f7f5421b80cce4e7.jpg` |  |  |  |
| details author | PASS | Kim Eunji |  |  |  |
| details artist | PASS | Kim Eunji |  |  |  |
| details genres | PASS | BL, Dram, Mafya, Sansürsüz, Yaoi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Savcı Baek, genellikle haydutların yardımına başvurarak delilleri ve tanık ifadelerini manipüle ederek kariyer basamaklarını tırmanmıştı. Başsavcılığın üst düzey yetkilileri, Baek’in başarısından etkilenerek, saygın bir aileden bir kadınla evlilik ayarlayarak imajlarını düzeltme zamanının geldiğine karar verdiler. Bunu, kendisine sorun çıkaran ısrarcı haydutla bağlarını koparmak için mükemmel bir fırsat olarak gören Baek, bu anlaşmayı kabul etti. Ancak, uzun süredir Baek’i gizlice destekleyen haydut, haberi duyduğunda ihanete uğradığını hissetti ve öfkelendi. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://averisfansub.site/.../Ba%C5%9Fl%C4%B1ks%C4%B1z72_20260414000511.png` (image/png, 1857271 bytes, 1364x768) |  |  |  |
