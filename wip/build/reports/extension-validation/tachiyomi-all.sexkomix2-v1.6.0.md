# Extension Validation Report

- Extension: tachiyomi-all.sexkomix2-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 3877278900974745213
- Source name: SexKomix2
- Source language: en
- Selected manga input: popular offset 0: Demon Slayer. Semidraws (`.../12705-porn-comic-demon-slayer--semidraws`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Demon Slayer. Semidraws (`.../12705-porn-comic-demon-slayer--semidraws`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 19 | MILF Catchers. Chapter 5. Croc (`.../14945-porn-comic-milf-catchers--chapter-5--croc`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 19 | Heroines in action. mr cookie for sexkomix2.com. (`.../25474-porn-comic-heroines-in-action--mr-cookie-for-sexkomix2-com-`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 19 | Violet Hypnotism. Inuyuru (`.../5993-porn-comic-violet-hypnotism--inuyuru`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Demon Slayer. Semidraws (`.../12705-porn-comic-demon-slayer--semidraws`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Demon Slayer. Semidraws (`.../12705-porn-comic-demon-slayer--semidraws`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../12705-porn-comic-demon-slayer--semidraws`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | <1s |

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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 19 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Demon Slayer. Semidraws, URL=`.../12705-porn-comic-demon-slayer--semidraws` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imgen.sexkomix2.com/.../mini_porn-comic-demon-slayer--semidraws-sex-comic-selection-of-art-2023-11-05-1270533.jpg` (image/jpeg, 12366 bytes, 300x185) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12705-porn-comic-demon-slayer--semidraws` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://imgen.sexkomix2.com/.../porn-comic-demon-slayer--semidraws-sex-comic-selection-of-art-2023-11-05-1270533.jpg` (image/jpeg, 78480 bytes, 1001x618) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big boobs, Big dick, Blondes, Brunettes, Fantasy, Hentai Manga, Parodies, Threesome, anime, beautiful, hentai, hot, manga, slut, xxx |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Porn comic Demon Slayer. Semidraws A selection of art and pictures with hot sexy babes. They strip naked and show off their gorgeous bodies before fucking their bigdicked friends. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imgen.sexkomix2.com/.../porn-comic-demon-slayer--semidraws-sex-comic-selection-of-art-2023-11-05-1270533.jpg` (image/jpeg, 78480 bytes, 1001x618) |  |  |  |
