# Extension Validation Report

- Extension: tachiyomi-fr.furyosquad-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 3
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 267710359229814456
- Source name: FuryoSquad
- Source language: fr
- Selected manga input: latest offset 0: NANBA MG5 (`.../nanba-mg5`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 37 | A-BOUT! (`.../about`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 8 | NANBA MG5 (`.../nanba-mg5`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | NANBA MG5 (`.../nanba-mg5`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | NANBA MG5 (`.../nanba-mg5`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 137 | Vol.1 Chapitre 1: La nouvelle vie d'un furyo (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 60 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 37 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=NANBA MG5, URL=`.../nanba-mg5` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 46/46 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 46/46 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.furyosociety.com/.../mangas` -> 4 manga URLs (examples: `.../a-bout`, `.../dustland`, `.../kyo-kara-ore-wa`), `https://www.furyosociety.com` -> 4 manga URLs (examples: `.../kyo-kara-ore-wa`, `.../shonan-bakusozoku`, `.../dustland`) |  |  |  |
| thumbnail | PASS | `https://www.furyosociety.com/.../square_icon_Nanba-MG5.jpg` (image/jpeg, 165332 bytes, 527x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../nanba-mg5` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://www.furyosociety.com/.../cover_Image0001.JPG` was not downloaded |  |  |  |
| details author | PASS | Ozawa Toshio |  |  |  |
| details artist | PASS | Ozawa Toshio |  |  |  |
| details genres | PASS | Furyō |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Nanba est un nom synonyme de puissance dans la rue, cette famille est furyo de la mère jusqu'au chien et compte bien conquérir tout le pays. Toute la famille s'attend à ce que Tsuyoshi marche dans les pas de son grand frère mais celui-ci a pour unique rêve de mener une vie de lycéen ordinaire loin des embrouilles et des bastons. Il va donc devoir mener une double vie entre lycéen modèle et furyo en Tokkōfuku. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 105 name |  |  |  |
| chapters | PASS | 137 chapters |  |  |  |
| chapter dates | LINT | 10 of 137 chapters lack a usable source upload timestamp: -129867360000 (unexpected negative value)=10 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.furyosociety.com/.../000-Nanbacredits-2018s.jpg` (image/jpeg, 797663 bytes, 992x1500) |  |  |  |
