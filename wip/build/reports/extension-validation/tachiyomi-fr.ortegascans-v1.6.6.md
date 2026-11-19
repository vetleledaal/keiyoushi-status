# Extension Validation Report

- Extension: tachiyomi-fr.ortegascans-v1.6.6
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
- Source ID: 8598370605081191622
- Source name: Ortega Scans
- Source language: fr
- Selected manga input: latest offset 0: Gavin's Bosses (`.../gavin-s-bosses`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | MILF Exchange Plan (`.../milf-exchange-plan`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Teacher’s Efforts (`.../teacher-s-efforts`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | Gavin's Bosses (`.../gavin-s-bosses`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Touch On (`.../touch-on`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Gavin's Bosses (`.../gavin-s-bosses`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Gavin's Bosses (`.../gavin-s-bosses`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Chapitre 1 (`.../cmwntuvpc0h5m65mc9czd781v`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gavin's Bosses, URL=`gavin-s-bosses` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ortegascans.fr/.../gavin-s-bosses.webp` (image/webp (encoding: lossy), 38804 bytes, 512x717) |  |  |  |
| details identity | PASS | Details preserved selected URL `gavin-s-bosses` |  |  |  |
| details thumbnail URL | PASS | `https://ortegascans.fr/.../gavin-s-bosses.webp` |  |  |  |
| details author | PASS | OB |  |  |  |
| details artist | PASS | Pa-gong |  |  |  |
| details genres | PASS | Drame, Mature, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Reconnu pour ses compétences, Gavin est engagé par un groupe de femmes aussi belles que séduisantes. Mais face à leurs tentations irrésistibles, il finit par franchir la ligne...<br><br>Noms alternatifs : 강철의 사장님들, Kangcheol's Bosses |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://ortegascans.fr/.../gavin-s-bosses` to `https://ortegascans.fr/.../gavin-s-bosses <redacted query values: _rsc>` (1 redirects); popular: `https://ortegascans.fr/.../1` to `https://ortegascans.fr/.../1 <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://ortegascans.fr/.../1-1.jpg` (image/jpeg, 1466160 bytes, 720x5000) |  |  |  |
