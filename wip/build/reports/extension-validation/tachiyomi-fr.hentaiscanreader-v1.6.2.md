# Extension Validation Report

- Extension: tachiyomi-fr.hentaiscanreader-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 22
- Lint: 1
- Warnings: 3
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: scanreader
- Source ID: 8376548397716758785
- Source name: Hentai Scan Reader
- Source language: fr
- Selected manga input: popular offset 0: Secret! Orgasm♡Hero (`.../secret-orgasm%E2%99%A1hero`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Secret! Orgasm♡Hero (`.../secret-orgasm%E2%99%A1hero`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Secret! Orgasm♡Hero (`.../secret-orgasm%E2%99%A1hero`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | The light I give you (`.../the-light-i-give-you`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | I Want To Mark You (`.../i-want-to-mark-you`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Secret! Orgasm♡Hero (`.../secret-orgasm%E2%99%A1hero`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret! Orgasm♡Hero (`.../secret-orgasm%E2%99%A1hero`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.lang.IllegalArgumentException: Unexpected char 0x2661 at 50 in Referer value: https://hentai.scanreader.net/.../secret-orgasm%E2%99%A1hero | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.IllegalArgumentException: Unexpected char 0x2661 at 50 in Referer value: https://hentai.scanreader.net/.../secret-orgasm%E2%99%A1hero | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret! Orgasm♡Hero, URL=`.../secret-orgasm%E2%99%A1hero` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Secret! Orgasm♡Hero, URL=`.../secret-orgasm%E2%99%A1hero` at page 1 offset 0 and page 2 offset 0, title=The Eminence in Shadow -「I NEED MORE POWER!」(Doujinshi), URL=`.../the-eminence-in-shadow-%E3%80%8Ci-need-more-power%E3%80%8Ddoujinshi` at page 1 offset 2 and page 2 offset 8, title=Secret Class, URL=`.../secret-class` at page 1 offset 4 and page 2 offset 4, title=Tensei Coliseum: Saijaku Skill de Saikyou no Onna-tachi o Koryaku Shite Dorei Harem Tsukurimasu, URL=`.../tensei-coliseum-saijaku-skill-de-saikyou-no-onna-tachi-o-koryaku-shite-dorei-harem-tsukurimasu` at page 1 offset 6 and page 2 offset 3, title=Akogare no Seitokaichou ga Kyonyuu Sugiru Ken, URL=`.../akogare-no-seitokaichou-ga-kyonyuu-sugiru-ken` at page 1 offset 7 and page 2 offset 5 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 44/44 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 43/44 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentai.scanreader.net/.../50f3ea27-66b2-4eb9-9de9-6f6042a4d95b-225x300.png` (image/png, 1138217 bytes, 840x1120) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-orgasm%E2%99%A1hero` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://hentai.scanreader.net/.../50f3ea27-66b2-4eb9-9de9-6f6042a4d95b.png` was not downloaded |  |  |  |
| details author | PASS | Boiled Chicken |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Full Color, Long Strip, Superhero |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Salut, je suis la héroïne de classe B, “Heart Eye Girl”. Mon pouvoir ? Plus je suis excité, plus je deviens forte… Oui, d’une manière plutôt osée. Mon pouvoir est vraiment trop gênant, donc jusqu’à maintenant, j’ai toujours caché mes véritables capacités en jouant le rôle de la victime. Récemment, j’ai été tellement accaparée par ces sensations qu’il m’a été impossible de cacher la vérité… Maintenant, les vilains s’acharnent sur moi, m’envoyant des photos explicites et me demandant d’être leur partenaire. Est-ce que je devrais continuer comme ça ? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
