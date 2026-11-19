# Extension Validation Report

- Extension: tachiyomi-en.roliascan-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangataro
- Source ID: 3390167717659783669
- Source name: Rolia Scan
- Source language: en
- Selected manga input: popular offset 0: My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 22 | My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 22 | Revenge of the Sword Clan's Hound (`.../%7B%22id%22:%2210834%22,%22slug%22:%22revenge-of-the-sword-clan-039-s-hound%22%7D`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 115 | Karada kara Hajimeru Dekiai Kekkon: Konyaku Haki Saretara Gokujou Supadari ni Tsukamarimashita (`.../%7B%22id%22:%22384426%22,%22slug%22:%22karada-kara-hajimeru-dekiai-kekkon-konyaku-haki-saretara-gokujou-supadari-ni-tsukamarimashita%22%7D`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 119 | The Carefree Life of an SSS-Class Knight (`.../%7B%22id%22:%22372574%22,%22slug%22:%22the-carefree-life-of-an-sss-class-knight%22%7D`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 92 | Chapter 1 (`.../ch1-9545`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | <1s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 115 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Bias Gets on the Last Train, URL=`{"id":"7","slug":"my-bias-gets-on-the-last-train"}` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=The Carefree Life of an SSS-Class Knight, URL=`{"id":"372574","slug":"the-carefree-life-of-an-sss-class-knight"}` at page 1 offset 113 and page 2 offset 0, title=Our Suspicious Prince Is Actually the Master of Martial Art, URL=`{"id":"372504","slug":"our-suspicious-prince-is-actually-the-master-of-martial-art"}` at page 1 offset 114 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 279/279 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 279/279 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://via.placeholder.com/.../300x400` -> 3 manga URLs (examples: `{"id":"382996","slug":"karui-kimochi-de-kaedama-ni-nattara-tondemonai-otto-ga-tsuitekita"}`, `{"id":"380370","slug":"why-can-t-i-break-off-my-engagement"}`, `{"id":"376355","slug":"i-was-reincarnated-as-a-villainess-but-i-became-obsessed-with-magic-and-ended-up-being-doted-on-by-a-prince"}`) |  |  |  |
| thumbnail | PASS | `https://roliascan.com/.../178671l.webp` (image/webp (encoding: lossy), 46758 bytes, 414x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `{"id":"7","slug":"my-bias-gets-on-the-last-train"}` |  |  |  |
| details thumbnail URL | PASS | `https://roliascan.com/.../178671l.webp` |  |  |  |
| details author | PASS | Jixksee |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Every night, Yeo-un takes the last train home—same route, same time, same routine. But one thing keeps catching his eye: a girl with a guitar and a presence that lingers in his mind. When a shared love for the indie band Long Afternoon sparks a conversation, their late-night encounters begin to turn into something more. But Hae-in isn't just another fan—she's the voice behind the band, a secret she can't afford to reveal. As music draws them closer, the truth may threaten to pull them apart. When the final note plays, will their story end in harmony… or heartbreak?<br>(Source: Webtoon Entertainment)<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 25 name |  |  |  |
| chapters | PASS | 92 chapters |  |  |  |
| chapter dates | PASS | 92 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangataro.yachts/.../001.webp` (image/webp (encoding: lossy), 40274 bytes, 900x1360) |  |  |  |
