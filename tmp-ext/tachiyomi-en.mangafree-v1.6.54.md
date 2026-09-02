# Extension Validation Report

- Extension: tachiyomi-en.mangafree-v1.6.54
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
- Source ID: 3386549954655095711
- Source name: Mangafree
- Source language: en
- Selected manga input: popular offset 0: Perfect Secret Love: The Bad New Wife Is A Little Sweet (`.../742`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Perfect Secret Love: The Bad New Wife Is A Little Sweet (`.../742`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Second-To-None Adoration (`.../544`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The secret of the female professor (`.../4480`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Cry Or Better Yet, Beg (`.../4918`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Perfect Secret Love: The Bad New Wife Is A Little Sweet (`.../742`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Perfect Secret Love: The Bad New Wife Is A Little Sweet (`.../742`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 586 | 311 (`.../311`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Perfect Secret Love: The Bad New Wife Is A Little Sweet, URL=`742` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangafree.info/.../111-350x476.jpg` (image/jpeg, 40854 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `742` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangafree.info/.../111-193x278.jpg` (image/jpeg, 16923 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Manhua, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “How perverted is Si Ye Han’s taste? He still wants me like this?” Waking up, she looked at her reflection in the mirror: explosive wig, tattoos, and demon-like makeup. Any normal person’s eyes would burn if they looked at her for more than a second. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 586 chapters |  |  |  |
| chapter dates | LINT | 89 of 586 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=89 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://mangafree.info/.../1-f.jpg` (image/webp (container: extended), 79586 bytes, 800x1416; server Content-Type: image/jpeg) |  |  |  |
