# Extension Validation Report

- Extension: tachiyomi-fr.aniverse-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4821794959228633650
- Source name: Aniverse
- Source language: fr
- Selected manga input: popular offset 0: Hero X Demon Queen (`.../hero-x-demon-queen`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | Hero X Demon Queen (`.../hero-x-demon-queen`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | The Regressed Son of a Duke is an Assassin (`.../the-regressed-son-of-a-duke-is-an-assassin`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | Hero X Demon Queen (`.../hero-x-demon-queen`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hero X Demon Queen (`.../hero-x-demon-queen`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 137 | Chapitre 1 (`.../73708596-b3bf-4b0e-b93e-8a6985538bda`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hero X Demon Queen, URL=`hero-x-demon-queen` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 62/62 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 62/62 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.onefy.me/.../poster-4506549d.jpg` (image/jpeg, 23065 bytes, 230x307) |  |  |  |
| details identity | PASS | Details preserved selected URL `hero-x-demon-queen` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.onefy.me/.../poster-4506549d.jpg` |  |  |  |
| details author | PASS | Zhihong Yao |  |  |  |
| details artist | PASS | Loklam |  |  |  |
| details genres | PASS | Action, Comedy, Fantasy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | <p>J’aspirais à la tranquillité de la campagne, mais le destin en avait décidé autrement. Soudain, je me suis retrouvé transporté dans un monde entièrement nouveau. Dans le Village des débutants, j’ai atteint le rang d’entité de niveau création. Puis, contre toute attente, j’ai vaincu l’impératrice démoniaque qui régnait sur ce monde, avec pour seul allié un chien que j’avais élevé. À partir de ce moment décisif, l’impératrice démoniaque vaincue s’est installée dans mon humble demeure, et mon extraordinaire aventure dans cet autre monde a commencé.<.../p%3E |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 137 chapters |  |  |  |
| chapter dates | PASS | 137 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.onefy.me/.../001.jpg` (image/jpeg, 441611 bytes, 1200x1250) |  |  |  |
