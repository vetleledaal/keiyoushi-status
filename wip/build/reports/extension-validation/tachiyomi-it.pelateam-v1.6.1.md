# Extension Validation Report

- Extension: tachiyomi-it.pelateam-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5135856828016450786
- Source name: PelaTeam
- Source language: it
- Selected manga input: popular offset 0: One-Punch Man - Murata (`.../One-Punch%20Man%20-%20Murata`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | One-Punch Man - Murata (`.../One-Punch%20Man%20-%20Murata`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | One-Punch Man - Murata (`.../One-Punch%20Man%20-%20Murata`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One-Punch Man - Murata (`.../One-Punch%20Man%20-%20Murata`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Pugno 172 ~ (212) ~ I.O (`.../Computer <redacted query values: manga, volume, and chapter>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One-Punch Man - Murata, URL=`One-Punch Man - Murata` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 6/6 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 6/6 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pelateam.org/.../thumb.jpg` (image/jpeg, 144032 bytes, 471x750) |  |  |  |
| details identity | PASS | Details preserved selected URL `One-Punch Man - Murata` |  |  |  |
| details thumbnail URL | PASS | `https://pelateam.org/.../thumb.jpg` |  |  |  |
| details author | PASS | ONE |  |  |  |
| details artist | PASS | Yusuke Murata |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dopo un allenamento durato tre anni, un ragazzo di nome Saitama ha raggiunto il suo obiettivo: diventare la persona piu' forte del mondo. Passa i giorni scacciando i mostri e i criminali dalle citta' ma, a causa della poderosa forza acquisita, gli basta sferrare un solo pugno per riuscire a sconfiggere anche i nemici piu' potenti. Per questo Saitama e' sempre annoiato e alla ricerca di un avversario che possa resistere ai suoi colpi. In seguito, con la conoscenza del cyborg Genos, entrera' a far parte di un'organizzazione, nota come Associazione degli Eroi, che riunisce i supereroi della Terra con lo scopo di combattere criminali e mostri; l'obiettivo di Saitama e' scalare le classifiche dell'Associazione e diventare uno dei supereroi piu' popolari. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | LINT | 49 of 50 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=49 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pelateam.org/.../00.jpg` (image/jpeg, 377393 bytes, 800x1138) |  |  |  |
