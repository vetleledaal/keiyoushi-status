# Extension Validation Report

- Extension: tachiyomi-fr.scanreader-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: scanreader
- Source ID: 6450715347254021327
- Source name: Scan Reader
- Source language: fr
- Selected manga input: popular offset 0: The Rebel of the Tyrant Noble Family (`.../the-rebel-of-the-tyrant-noble-family`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | The Rebel of the Tyrant Noble Family (`.../the-rebel-of-the-tyrant-noble-family`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 13 | What Can I Do Alone ? (`.../what-can-i-do-alone`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Living as the Tyrant’s Older Sister (`.../living-as-the-tyrants-older-sister`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | World-Saving is a Skill (`.../world-saving-is-a-skill`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Rebel of the Tyrant Noble Family (`.../the-rebel-of-the-tyrant-noble-family`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Rebel of the Tyrant Noble Family (`.../the-rebel-of-the-tyrant-noble-family`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 36 | Chapitre 1 (`.../chapitre-1-333`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 43 |  |  | 1-10s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Rebel of the Tyrant Noble Family, URL=`.../the-rebel-of-the-tyrant-noble-family` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://scanreader.net/.../The Rebel of the Tyrant Noble Family-cover-224x300.jpeg` (image/jpeg, 22591 bytes, 224x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-rebel-of-the-tyrant-noble-family` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://scanreader.net/.../The%20Rebel%20of%20the%20Tyrant%20Noble%20Family-cover.jpeg` (image/jpeg, 259300 bytes, 860x1152) |  |  |  |
| details author | PASS | Ryō Tatsuma, Armode Culture Yingmu Culture |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ash s’est consacré à son père adoptif, déterminé à lui rendre la gentillesse dont il avait fait preuve en l’accueillant alors qu’il était orphelin. Cependant, la vérité qu’il a apprise au bord de la mort était tout autre. Tous les efforts qu’il avait déployés… Toute la confiance qu’il avait accordée… Même le plus grand pouvoir dont il était doté à la naissance, les Sept Ailes… Tout lui avait été volé… ! Alors maintenant… Allons-nous commencer une vie de vengeance et de renversement ? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 36 chapters |  |  |  |
| chapter dates | PASS | 36 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular_next: `https://scanreader.net/.../1 <redacted query values: sort>` to `https://scanreader.net/.../bibliotheque <redacted query values: sort>` (1 redirects); latest: `https://scanreader.net/.../1` to `https://scanreader.net/.../dernieres-sorties` (1 redirects) |  |  |  |
| page load | PASS | `https://scanreader.net/.../the-rebel-of-the-tyrant-noble-family-chap-1.0-p1.jpeg` (image/jpeg, 505546 bytes, 800x5000) |  |  |  |
