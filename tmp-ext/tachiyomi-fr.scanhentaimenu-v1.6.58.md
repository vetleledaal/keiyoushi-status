# Extension Validation Report

- Extension: tachiyomi-fr.scanhentaimenu-v1.6.58
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4153742697148883998
- Source name: X-Manga
- Source language: fr
- Selected manga input: popular offset 0: Sex Study Group (`.../2756`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Sex Study Group (`.../2756`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | New Town (`.../2329`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Milf Hunting in Another World (`.../3755`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Un Secret Bien Ficelé (`.../7248`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sex Study Group (`.../2756`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sex Study Group (`.../2756`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 110 | Chapitre 1 (`.../chapitre-1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sex Study Group, URL=`2756` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://x-manga.org/.../6ac34dc8-b0e2-4034-b968-317091dfce34-350x476.webp` (image/webp (encoding: lossy), 26266 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2756` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://x-manga.org/.../6ac34dc8-b0e2-4034-b968-317091dfce34.webp` (image/webp (encoding: lossy), 166224 bytes, 600x840) |  |  |  |
| details author | PASS | Abio4 |  |  |  |
| details artist | PASS | Baengkki |  |  |  |
| details genres | PASS | Drama, Romance, Pornwha, Updating |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Hyun-Ho rejoint un groupe d’étude pour se rapprocher de la jolie senior pour laquelle il a le béguin. Mais ce groupe d’étude sort de l’ordinaire… ! Une leçon SPÉCIALE pour lui commence ! « Ici, Hyun-Ho. Attrape mes fesses comme ça ! »<br><br>Alternative Names: 섹터디그룹 \| Sextudy Group |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 110 chapters |  |  |  |
| chapter dates | LINT | All 110 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=110 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
