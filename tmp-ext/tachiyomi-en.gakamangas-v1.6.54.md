# Extension Validation Report

- Extension: tachiyomi-en.gakamangas-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5246625723235112128
- Source name: GakaMangas
- Source language: en
- Selected manga input: popular offset 0: The anime geniuses meet (`.../290`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 11 | The anime geniuses meet (`.../290`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | Battle of anime’s strongest (`.../2144`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The anime geniuses meet (`.../290`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The anime geniuses meet (`.../290`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 30 | Chapter 1 (`.../chapter-1_4`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The anime geniuses meet, URL=`290` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gakamangas.com/.../463893678bbc4fa720d490d0b98ce29c-350x476.jpeg` (image/jpeg, 38367 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `290` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://gakamangas.com/.../463893678bbc4fa720d490d0b98ce29c-193x278.jpeg` (image/jpeg, 15866 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Series, Psychological |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sosuke Aizen, the mastermind from “Bleach,” finds himself drawn to a mysterious room. As he steps inside, he is greeted by an assembly of extraordinary intellects: Lelouch Lamperouge from “Code Geass,” Yuuichi Katagiri from “Tomodachi Game,” Light Yagami from “Death Note,” Senku Ishigami from “Dr. Stone,” Shikamaru Nara from “Naruto,” and Ayanokoji Kiyotaka from “Classroom of the Elite.”<br><br>what will happen next…? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | LINT | 5 of 30 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://gakamangas.com/.../IMG_1848.JPEG` (image/jpeg, 232925 bytes, 1080x1309) |  |  |  |
