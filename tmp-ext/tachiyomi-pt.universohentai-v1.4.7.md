# Extension Validation Report

- Extension: tachiyomi-pt.universohentai-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4207492914234184899
- Source name: Universo Hentai
- Source language: pt-BR
- Selected manga input: latest offset 0: Succubus Sex Subscription Jinsei Makegumi Doutei no Boku ga Kyonyuu Succubus to Namanaka Sex Shihodai no Subsc Keiyaku de Jinsei Kachigumi ni! (`.../succubus-sex-subscription-jinsei-makegumi-doutei-no-boku-ga-kyonyuu-succubus-to-namanaka-sex-shihodai-no-subsc-keiyaku-de-jinsei-kachigumi-ni`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | Succubus Sex Subscription Jinsei Makegumi Doutei no Boku ga Kyonyuu Succubus to Namanaka Sex Shihodai no Subsc Keiyaku de Jinsei Kachigumi ni! (`.../succubus-sex-subscription-jinsei-makegumi-doutei-no-boku-ga-kyonyuu-succubus-to-namanaka-sex-shihodai-no-subsc-keiyaku-de-jinsei-kachigumi-ni`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 17 | Shitate ni wa Denai kedo Chinko ni wa Yowai Gyaru-chan to Kyokon Otaku! (`.../shitate-ni-wa-denai-kedo-chinko-ni-wa-yowai-gyaru-chan-to-kyokon-otaku`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 17 | Succubus Sex Subscription Jinsei Makegumi Doutei no Boku ga Kyonyuu Succubus to Namanaka Sex Shihodai no Subsc Keiyaku de Jinsei Kachigumi ni! (`.../succubus-sex-subscription-jinsei-makegumi-doutei-no-boku-ga-kyonyuu-succubus-to-namanaka-sex-shihodai-no-subsc-keiyaku-de-jinsei-kachigumi-ni`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 17 | Shitate ni wa Denai kedo Chinko ni wa Yowai Gyaru-chan to Kyokon Otaku! (`.../shitate-ni-wa-denai-kedo-chinko-ni-wa-yowai-gyaru-chan-to-kyokon-otaku`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Succubus Sex Subscription Jinsei Makegumi Doutei no Boku ga Kyonyuu Succubus to Namanaka Sex Shihodai no Subsc Keiyaku de Jinsei Kachigumi ni! (`.../succubus-sex-subscription-jinsei-makegumi-doutei-no-boku-ga-kyonyuu-succubus-to-namanaka-sex-shihodai-no-subsc-keiyaku-de-jinsei-kachigumi-ni`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Succubus Sex Subscription Jinsei Makegumi Doutei no Boku ga Kyonyuu Succubus to Namanaka Sex Shihodai no Subsc Keiyaku de Jinsei Kachigumi ni! (`.../succubus-sex-subscription-jinsei-makegumi-doutei-no-boku-ga-kyonyuu-succubus-to-namanaka-sex-shihodai-no-subsc-keiyaku-de-jinsei-kachigumi-ni`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo único (`.../galeria <redacted query values: id>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 60 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Succubus Sex Subscription Jinsei Makegumi Doutei no Boku ga Kyonyuu Succubus to Namanaka Sex Shihodai no Subsc Keiyaku de Jinsei Kachigumi ni!, URL=`.../succubus-sex-subscription-jinsei-makegumi-doutei-no-boku-ga-kyonyuu-succubus-to-namanaka-sex-shihodai-no-subsc-keiyaku-de-jinsei-kachigumi-ni` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 69/69 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 69/69 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://universohentai.com/.../001-16-371x518.jpg` (image/jpeg, 249413 bytes, 371x518) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../succubus-sex-subscription-jinsei-makegumi-doutei-no-boku-ga-kyonyuu-succubus-to-namanaka-sex-shihodai-no-subsc-keiyaku-de-jinsei-kachigumi-ni` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://universohentai.com/.../001-16.jpg` (image/jpeg, 447337 bytes, 1280x1810) |  |  |  |
| details author | PASS | Login |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boquete, Colegial, Creampie, Garota Demônio, Masturbação, Paizuri, Peitões, Raio-X, Succubus |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://universohentai.com/.../001-16.jpg` (image/jpeg, 447337 bytes, 1280x1810) |  |  |  |
