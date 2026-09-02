# Extension Validation Report

- Extension: tachiyomi-fr.bluesolo-v1.6.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2095949455655924623
- Source name: Blue Solo
- Source language: fr
- Selected manga input: popular offset 0: Aishiteru Game wo Owarasetai (`.../aishiteru-game-wo-owarasetai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 96 | Aishiteru Game wo Owarasetai (`.../aishiteru-game-wo-owarasetai`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Drama Queen (`.../drama-queen`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Aishiteru Game wo Owarasetai (`.../aishiteru-game-wo-owarasetai`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Aishiteru Game wo Owarasetai (`.../aishiteru-game-wo-owarasetai`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 83 | Vol.1 Ch.1 - Des amis d'enfance qui ne veulent pas perdre (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 59 |  |  | <1s |

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
| popular listing | PASS | 96 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Aishiteru Game wo Owarasetai, URL=`.../aishiteru-game-wo-owarasetai` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 107/107 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 107/107 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bluesolo.org/.../20f124a3-4bdf-40a1-a6c4-b0125677eafe.png <redacted query values: v>` (image/png, 3653218 bytes, 1412x2000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../aishiteru-game-wo-owarasetai` |  |  |  |
| details thumbnail URL | PASS | `https://bluesolo.org/.../20f124a3-4bdf-40a1-a6c4-b0125677eafe.png <redacted query values: v>` |  |  |  |
| details author | PASS | Domoto Yuki |  |  |  |
| details artist | PASS | Domoto Yuki |  |  |  |
| details genres | PASS | Comédie, Romance, Tranche de vie |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | À l'âge de onze ans, Yukiya et Miku ont commencé « un jeu de l'amour » avec des règles simples : ils s'annoncent mutuellement leur amour et l'autre doit rester de marbre ! Maintenant au lycée, ils s'adonnent toujours à ce jeu sans fin, car aucun des deux ne veut reconnaître sa défaite ! Réellement amoureux l'un de l'autre, ils continuent de se lancer des « je t'aime » à tout va, et à se taquiner quotidiennement. Le problème ? Le jeu se corse d'année en année et tous les coups sont maintenant permis... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 83 chapters |  |  |  |
| chapter dates | PASS | 83 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 59 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://bluesolo.org/.../001.png <redacted query values: v>` (image/png, 3717348 bytes, 1445x2048) |  |  |  |
