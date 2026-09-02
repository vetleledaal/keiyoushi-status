# Extension Validation Report

- Extension: tachiyomi-tr.mangazure-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5075981853261303438
- Source name: MangaZure
- Source language: tr
- Selected manga input: popular offset 0: Martial Peak (`.../1713`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Martial Peak (`.../1713`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Tale of a Scribe Who Retires to the Countryside (`.../704`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Serena (`.../252`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Overgeared (`.../35`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Martial Peak (`.../1713`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../1713`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3852 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`1713` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangazure.net/.../Martial-Peak-350x476.png` (image/png, 279537 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `1713` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangazure.net/.../Martial-Peak.png` (image/png, 1704783 bytes, 1000x1415) |  |  |  |
| details author | PASS | Momo (Ii) |  |  |  |
| details artist | PASS | Momo (Ii) |  |  |  |
| details genres | PASS | Aksiyon, Dövüş Sanatları, Fantezi, Macera, Tarihi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Alternative Names: The Pinnacle of Martial Arts, MP, 武炼巅峰 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3852 chapters |  |  |  |
| chapter dates | LINT | 3 of 3852 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdni.xyz/.../1.jpg` (image/jpeg, 117875 bytes, 800x1132) |  |  |  |
