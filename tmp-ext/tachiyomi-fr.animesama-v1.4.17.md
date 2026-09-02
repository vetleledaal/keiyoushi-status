# Extension Validation Report

- Extension: tachiyomi-fr.animesama-v1.4.17
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 21
- Lint: 0
- Warnings: 2
- Skipped: 11
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5104384223103778991
- Source name: AnimeSama
- Source language: fr
- Selected manga input: popular offset 0: 07 Ghost (`.../07-ghost`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 48 | 07 Ghost (`.../07-ghost`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 48 | Ao Ashi (`.../ao-ashi`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 85 | Hardcore Leveling Warrior Earth Game (`.../va`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | 07 Ghost (`.../07-ghost`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 07 Ghost (`.../07-ghost`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | <1s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 85 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=07 Ghost, URL=`.../07-ghost` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 8 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 183/183 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 183/183 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://cdn.jsdelivr.net/.../99-reinforced-wood-stick.webp` -> 2 manga URLs (examples: `.../99-reinforced-wood-stick`, `.../99-reinforced-wood-stick`), `https://cdn.jsdelivr.net/.../a-mercenarys-rebirth-among-nobles.webp` -> 2 manga URLs (examples: `.../a-mercenarys-rebirth-among-nobles`, `.../a-mercenarys-rebirth-among-nobles`), `https://cdn.jsdelivr.net/.../a-wimps-strategy-guide-to-conquer-the-tower.webp` -> 2 manga URLs (examples: `.../a-wimps-strategy-guide-to-conquer-the-tower`, `.../a-wimps-strategy-guide-to-conquer-the-tower`), `https://cdn.jsdelivr.net/.../absolute-dominion.webp` -> 2 manga URLs (examples: `.../absolute-dominion`, `.../absolute-dominion`), `https://cdn.jsdelivr.net/.../absolute-regression.webp` -> 2 manga URLs (examples: `.../absolute-regression`, `.../absolute-regression`), `https://cdn.jsdelivr.net/.../academys-genius-swordmaster.webp` -> 2 manga URLs (examples: `.../academys-genius-swordmaster`, `.../academys-genius-swordmaster`) |  |  |  |
| thumbnail | PASS | `https://cdn.jsdelivr.net/.../07-ghost.webp` (image/webp (encoding: lossy), 23790 bytes, 440x247) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../07-ghost` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.jsdelivr.net/.../07-ghost.jpg` (image/jpeg, 680101 bytes, 2438x1369) |  |  |  |
| details author | PASS | Yuki Amemiya, Yukino Ichihara |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drame, Science, Fiction, Fantastique, Action, Aventure, Comédie, Fantasy, Mystère, Surnaturel, Military, Mythology, Josei |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Promis à un brillant avenir de soldat au sein de l’académie militaire de Barsburg, l’ascension de Teito Klein, orphelin et ancien esclave, suscite l’intérêt d’éminents pontifes religieux. Traqué par les forces de l’Empire, le jeune homme est alors placé sous la protection de trois prêtres du septième district. Grâce au soutien indéfectible de son meilleur ami, Mikage, Teito est déterminé à lever le voile sur les mystères entourant son passé… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
