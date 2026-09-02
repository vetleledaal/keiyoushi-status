# Extension Validation Report

- Extension: tachiyomi-fr.bananascan-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3121632933690925888
- Source name: Harmony-Scan
- Source language: fr
- Selected manga input: popular offset 0: Law of reincarnation (`.../2138`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Law of reincarnation (`.../2138`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | High School Taoist (`.../2113`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | The Novice’s Frontline (`.../3506`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Magician from Another World (`.../1896`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Law of reincarnation (`.../2138`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Law of reincarnation (`.../2138`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 79 | Chapitre 1 (`.../chapitre-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Law of reincarnation, URL=`2138` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 87/87 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 87/87 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://harmony-scan.fr/.../49e01900-b080-47f4-b6ff-15a1a7f90471-_1_-175x238.jpg` (image/jpeg, 15844 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `2138` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://harmony-scan.fr/.../49e01900-b080-47f4-b6ff-15a1a7f90471-_1_-193x278.jpg` (image/jpeg, 19589 bytes, 193x278) |  |  |  |
| details author | PASS | Matgini |  |  |  |
| details artist | PASS | Naru |  |  |  |
| details genres | PASS | 18+, Adulte, Mature, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Une seconde chance de retrouver un ancien premier amour, Bang Inchul revient 3 ans en arrière, lors de son embauche dans l’entreprise. Mais ses efforts pour se rapprocher d’elle ne fonctionnent pas, de plus une collègue qui était très sérieuse et professionnelle commence à le séduire…<br><br>« C’est gênant si je suis la seule à me déshabiller… Dépêche-toi de te déshabiller aussi. A moins que tu ne veuilles que je le fasse pour toi ? » |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 79 chapters |  |  |  |
| chapter dates | LINT | All 79 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=79 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://harmony-scan.fr/.../01.png` (image/png, 1934515 bytes, 1036x3264) |  |  |  |
