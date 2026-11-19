# Extension Validation Report

- Extension: tachiyomi-id.areakomik-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7657318872152395076
- Source name: Area Komik
- Source language: id
- Selected manga input: popular offset 0: Vaginaku Jadi Incaran Mertuaku Yang Mesum (Tsumibukai Yokubo) (`.../vaginaku-jadi-incaran-mertuaku-yang-mesum`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 22 | Vaginaku Jadi Incaran Mertuaku Yang Mesum (Tsumibukai Yokubo) (`.../vaginaku-jadi-incaran-mertuaku-yang-mesum`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 22 | Komik Dewasa Madloki Cerita Citra (`.../komik-dewasa-madloki-cerita-citra`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 22 | Antropologi Budaya Karya Shindol (`.../antropologi-budaya-karya-shindol`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 22 | Sensasi Ruru (`.../sensasi-ruru`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Vaginaku Jadi Incaran Mertuaku Yang Mesum (Tsumibukai Yokubo) (`.../vaginaku-jadi-incaran-mertuaku-yang-mesum`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Vaginaku Jadi Incaran Mertuaku Yang Mesum (Tsumibukai Yokubo) (`.../vaginaku-jadi-incaran-mertuaku-yang-mesum`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 24 | Chapter 01 (`.../vaginaku-jadi-incaran-mertuaku-yang-mesum-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 87 |  |  | 1-10s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vaginaku Jadi Incaran Mertuaku Yang Mesum (Tsumibukai Yokubo), URL=`.../vaginaku-jadi-incaran-mertuaku-yang-mesum` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://areakomik.com/.../Untitled-1-257x300.png` (image/png, 96633 bytes, 257x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../vaginaku-jadi-incaran-mertuaku-yang-mesum` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://areakomik.com/.../Untitled-1.png` (image/png, 465993 bytes, 521x607) |  |  |  |
| details author | PASS | Zetto |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Cheating, NTR, Nakadashi, Doujinshi, Ahegao, MILF, Big Breasts, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Judul alternatif: Tsumibukai yokubō, Sinful Lust |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | PASS | 24 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 87 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://warungkomikcdn.icu/.../KOMIKDEWASA.ART_KOMIKDEWASA.ART_Tsumibukai-yokubo-Chapter-1009.jpg` (image/jpeg, 391824 bytes, 600x849) |  |  |  |
