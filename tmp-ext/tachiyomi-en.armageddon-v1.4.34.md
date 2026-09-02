# Extension Validation Report

- Extension: tachiyomi-en.armageddon-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1281315089117038639
- Source name: Armageddon
- Source language: en
- Selected manga input: latest offset 0: Mocked as a Sidelined Editor, I Ended Up Living Together with a Pair of Twin High School Girls. (`.../after-being-mocked-for-being-a-sideline-editor-i-ended-up-living-with-twin-high-school-girls`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Doing Secret Things with the Holy Maidens (`.../doing-secret-things-with-the-holy-maidens`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Mocked as a Sidelined Editor, I Ended Up Living Together with a Pair of Twin High School Girls. (`.../after-being-mocked-for-being-a-sideline-editor-i-ended-up-living-with-twin-high-school-girls`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Mocked as a Sidelined Editor, I Ended Up Living Together with a Pair of Twin High School Girls. (`.../after-being-mocked-for-being-a-sideline-editor-i-ended-up-living-with-twin-high-school-girls`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The Despised Level 0 Incompetent Explorer is Actually the World’s Strongest: The First Place in the Exploration Ranking is a Mysterious Person (`.../the-despised-level-0-incompetent-explorer-is-actually-the-worlds-strongest-the-first-place-in-the-exploration-ranking-is-a-mysterious-person`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mocked as a Sidelined Editor, I Ended Up Living Together with a Pair of Twin High School Girls. (`.../after-being-mocked-for-being-a-sideline-editor-i-ended-up-living-with-twin-high-school-girls`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mocked as a Sidelined Editor, I Ended Up Living Together with a Pair of Twin High School Girls. (`.../after-being-mocked-for-being-a-sideline-editor-i-ended-up-living-with-twin-high-school-girls`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 18 | Chapter 1 (`.../after-being-mocked-for-being-a-sideline-editor-i-ended-up-living-with-twin-high-school-girls-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 34 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mocked as a Sidelined Editor, I Ended Up Living Together with a Pair of Twin High School Girls., URL=`.../after-being-mocked-for-being-a-sideline-editor-i-ended-up-living-with-twin-high-school-girls` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.silentquill.net/.../811817081910.webp` (image/webp (encoding: lossy), 388808 bytes, 1728x2458) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../after-being-mocked-for-being-a-sideline-editor-i-ended-up-living-with-twin-high-school-girls` |  |  |  |
| details thumbnail URL | PASS | `https://www.silentquill.net/.../811817081910.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Ecchi, Romance, School life, Seinen |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | “If you let us stay… you can do naughty things with us.” Mitsuhiko Okaya, an unremarkable man, was betrayed by his wife and a junior colleague. At work, he was mocked as a useless editor and spiraled into despair, until one day before him appeared a pair of twin high school girls he shouldn’t know, yet somehow seemed familiar. The younger twin, Akari, was lively, cheerful, and always teasing him, while the elder twin, Nanako, was shy and clumsy, yet secretly a closet pervert. ..They were once his students from the cram school where he worked during his student days. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | PASS | 18 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.asdasdhg.com/.../1.webp` (image/webp (encoding: lossy), 109148 bytes, 1350x1421) |  |  |  |
