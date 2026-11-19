# Extension Validation Report

- Extension: tachiyomi-fr.animesama-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 21
- Lint: 0
- Warnings: 3
- Skipped: 11
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5104384223103778991
- Source name: AnimeSama
- Source language: fr
- Selected manga input: popular offset 0: 07 Ghost (`.../07-ghost`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | 07 Ghost (`.../07-ghost`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 48 | Amour Sucré (`.../amour-sucre`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Overgeared (`.../overgeared`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 07 Ghost (`.../07-ghost`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 07 Ghost (`.../07-ghost`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

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
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=07 Ghost, URL=`.../07-ghost` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 1 manga entry: title=Tales Of Demons And Gods, URL=`.../tales-of-demons-and-gods` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 128/128 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 128/128 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://cdn.jsdelivr.net/.../a-second-life-to-reverse-the-kings.webp` -> 2 manga URLs (examples: `.../a-second-life-to-reverse-the-kings`, `.../a-second-life-to-reverse-the-kings`), `https://cdn.jsdelivr.net/.../absolute-dominion.webp` -> 2 manga URLs (examples: `.../absolute-dominion`, `.../absolute-dominion`) |  |  |  |
| thumbnail | PASS | `https://cdn.jsdelivr.net/.../07-ghost.webp` (image/jpeg, 56516 bytes, 342x513) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../07-ghost` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://image.tmdb.org/.../v4pW812Jpqpf3Ih5gYGCu51kdDl.jpg` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drame, Science, fiction, Fantastique, Action, Aventure, Comédie, Fantasy, Mystère, Surnaturel, Military, Mythology, Josei |  |  |  |
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
| redirects | UNUSUAL | popular: `https://anime-sama.to/.../catalogue <redacted query values: type\[\] and page>` to `https://anime-sama.to/.../catalogue <redacted query values: type\[\] and page>` (1 redirects); popular: `https://anime-sama.to/.../catalogue <redacted query values: type\[\] and page>` to `https://anime-sama.to/.../catalogue <redacted query values: type\[\] and page>` (1 redirects); popular: `https://anime-sama.to/.../07-ghost` to `https://anime-sama.to/.../07-ghost` (1 redirects); popular: `https://anime-sama.to/.../catalogue <redacted query values: type\[\], search, and page>` to `https://anime-sama.to/.../catalogue <redacted query values: type\[\], search, and page>` (1 redirects); popular: `https://anime-sama.to/.../07-ghost` to `https://anime-sama.to/.../07-ghost` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
