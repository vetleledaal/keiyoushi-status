# Extension Validation Report

- Extension: tachiyomi-fr.pornhwafr-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 4388148978547727168
- Source name: Pornwha.fr
- Source language: fr
- Selected manga input: popular offset 0: Lustful Games (`.../lustful-games`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Lustful Games (`.../lustful-games`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | I Have to Sleep With a Stranger? (`.../i-have-to-sleep-with-a-stranger`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Beautiful Days (`.../beautiful-days`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Baiser addictif (`.../baiser-addictif`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Lustful Games (`.../lustful-games`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Lustful Games (`.../lustful-games`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 134 | Chapitre 1 (`.../lustful-games-chapitre-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 82 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lustful Games, URL=`.../lustful-games` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pornhwa.fr/.../lustful-games-227x300.webp` (image/webp (encoding: lossy), 16862 bytes, 227x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lustful-games` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://pornhwa.fr/.../lustful-games.webp` (image/webp (encoding: lossy), 83170 bytes, 1080x1430) |  |  |  |
| details author | PASS | Kampis |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Erotique, Fantasy, Pornhwa, Romance, School life, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Des anciens camarades de classe du lycée Haegeum reçoivent un jour un SMS étrange envoyé par un inconnu, les invitant à une réunion d’anciens élèves sur une île déserte, en échange de dix millions de won. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 134 chapters |  |  |  |
| chapter dates | LINT | All 134 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=134 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 82 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s22.yaoiscan.fr/.../001.webp` (image/webp (container: extended), 106106 bytes, 1280x3694) |  |  |  |
