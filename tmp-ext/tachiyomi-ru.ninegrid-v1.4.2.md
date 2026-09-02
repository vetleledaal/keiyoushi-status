# Extension Validation Report

- Extension: tachiyomi-ru.ninegrid-v1.4.2
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
- Source ID: 5811065998267343017
- Source name: NineGrid
- Source language: ru
- Selected manga input: popular offset 0: Crossed (`.../8728`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Crossed (`.../8728`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Venom (`.../2795`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Flash (`.../1791`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Savage Red Sonja: Queen of the Frozen Wastes (`.../5601`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 16 | Crossed (`.../8728`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Crossed (`.../8728`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 10 | #0 (`.../pages`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Crossed, URL=`8728` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://9grid.cc/.../thumbnail` (image/webp (encoding: lossy), 117906 bytes, 600x934) |  |  |  |
| details identity | PASS | Details preserved selected URL `8728` |  |  |  |
| details thumbnail URL | PASS | `https://9grid.cc/.../thumbnail` |  |  |  |
| details author | PASS | Avatar Press |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Horror, Thriller |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Стэн выживает в мире, где загадочная инфекция превратила людей в безумных убийц с крестообразными шрамами на лицах. Он присоединяется к группе уцелевших под руководством Синди, которая пытается защитить своего ребёнка. Выжившие пересекают опустевшую Америку, зная, что смерть поджидает за каждым углом.<br><br>Это экстремальный хоррор без надежды на спасение — как «Ходячие мертвецы», но в разы жестче и мрачнее. Эннис создаёт удушающую атмосферу безысходности, где человечность исчезает под давлением выживания. Читается как кошмар наяву с беспощадной честностью о том, на что способны люди в критической ситуации. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.9grid.cc/.../1778321157353_page_001.webp` (image/webp (container: extended), 618218 bytes, 2560x1992) |  |  |  |
