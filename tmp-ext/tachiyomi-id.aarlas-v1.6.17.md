# Extension Validation Report

- Extension: tachiyomi-id.aarlas-v1.6.17
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6495978594979776478
- Source name: Aarlas
- Source language: id
- Selected manga input: popular offset 0: Marry or Die: Women of Defeated Countries (`.../marry-or-die-women-of-defeated-countries.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Marry or Die: Women of Defeated Countries (`.../marry-or-die-women-of-defeated-countries.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Urakata de Support Shiteta Geinou Ikka wo Tsuihousareta Boku wa, Futsuu no Seishun wo Ouka Shitai (`.../urakata-de-support-shiteta-geinou-ikka.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Konsei wa Goen ga Arimasu you ni! (`.../konsei-wa-goen-ga-arimasu-you-ni.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Marry or Die: Women of Defeated Countries (`.../marry-or-die-women-of-defeated-countries.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Marry or Die: Women of Defeated Countries (`.../marry-or-die-women-of-defeated-countries.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | Chapter 01 (`.../chapter-01.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 57 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Marry or Die: Women of Defeated Countries, URL=`.../marry-or-die-women-of-defeated-countries.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../Tsuma%20Ka%20Shiv4.jpg` (image/jpeg, 42632 bytes, 225x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../marry-or-die-women-of-defeated-countries.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../Tsuma%20Ka%20Shiv4.jpg` (image/jpeg, 152158 bytes, 600x853) |  |  |  |
| details author | PASS | KISHIMA Kiraku |  |  |  |
| details artist | PASS | XPierrot |  |  |  |
| details genres | PASS | Fantasy, Harem, Mature, Seinen, Tragedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Di dunia lain, sebuah negara bernama Kekaisaran Anglo menaklukkan negara-negara lain. Para wanita dari negara-negara yang ditaklukkan itu memiliki dua pilihan: Menikah dengan keluarga kekaisaran, atau mati. Di aula Istana Kekaisaran, lima wanita cantik beradu dalam kontes seksi dan penuh kekerasan untuk memenangkan hati sang Pangeran. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../00000.jpg` (image/jpeg, 363380 bytes, 1131x1600) |  |  |  |
