# Extension Validation Report

- Extension: tachiyomi-tr.okutoon-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6023377011056301844
- Source name: OkuToon
- Source language: tr
- Selected manga input: popular offset 0: One Piece (`.../one-piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | One Piece (`.../one-piece`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Swordmaster's Youngest Son (`.../swordmaster-s-youngest-son`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 60 Frames: My Own Time (`.../60-frames-my-own-time`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Talent-Swallowing Magician (`.../talent-swallowing-magician`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | One Piece dj - Donki-san (`.../one-piece-dj-donki-san`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1226 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 9: title=One Piece, URL=`.../one-piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 106/106 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 106/106 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.okutoon.net/.../cover_1779829439_973e3978.webp` (image/webp (encoding: lossy), 169968 bytes, 600x786) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.okutoon.net/.../cover_1779829439_973e3978.webp` |  |  |  |
| details author | PASS | Yazar ve ÇizerEiichiro Oda |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gol D. Roger, Grand Line'a ulaşarak Korsanlar Kralı unvanını kazanan efsanevi bir korsandı. Dünya Hükümeti tarafından idam edilmeden hemen önce söylediği sözler, dünyanın en büyük hazinesi olan One Piece'in varlığını tüm dünyaya duyurdu. Bu açıklama, denizlere açılan sayısız insanla birlikte Büyük Korsan Çağı'nı başlattı. Bu çağın ortasında yola çıkan Monkey D. Luffy, sıradan bir korsan değildir. Onun hedefi korku salmak ya da zenginlik toplamak değil, özgürce denizlere açılmak, gerçek dostlar edinmek ve kendi hayalinin peşinden gitmektir. Korsanlar Kralı olmak isteyen Luffy, bu amaçla kendine güçlü ve sıra dışı bir tayfa kurar. One Piece, Luffy ve Hasır Şapka Korsanları'nın Grand Line boyunca yaşadığı büyük macerayı anlatır. Yolculukları sırasında acımasız korsanlarla, güçlü denizcilerle ve dünyanın dengesini etkileyen karanlık yapılarla karşı karşıya kalırlar. Her ada yeni bir hikaye, yeni bir tehlike ve unutulmaz karakterler getirirken tayfanın bağı da giderek güçlenir. Aksiyon, mizah, dram ve macerayı bir araya getiren seri, geniş dünyası ve uzun soluklu hikaye anlatımıyla modern manganın en bilinen yapımlarından biridir. Luffy'nin One Piece'e ulaşma yolculuğu, sadece bir hazine avı değil, aynı zamanda özgürlük, dostluk ve hayaller uğruna verilen büyük bir mücadeledir. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1226 chapters |  |  |  |
| chapter dates | PASS | 1226 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://okutoon.com/.../tur <redacted query values: sira and sayfa>` to `https://okutoon.net/.../tur <redacted query values: sira and sayfa>` (1 redirects); popular: `https://okutoon.com/.../tur <redacted query values: sira and sayfa>` to `https://okutoon.net/.../tur <redacted query values: sira and sayfa>` (1 redirects); popular: `https://okutoon.com/.../tur <redacted query values: sira and sayfa>` to `https://okutoon.net/.../tur <redacted query values: sira and sayfa>` (1 redirects); popular: `https://okutoon.com/.../one-piece` to `https://okutoon.net/.../one-piece` (1 redirects); popular: `https://okutoon.com/.../tur <redacted query values: sayfa, q, and sira>` to `https://okutoon.net/.../tur <redacted query values: sayfa, q, and sira>` (1 redirects); popular: `https://okutoon.com/.../bolum-1` to `https://okutoon.net/.../bolum-1` (1 redirects); popular: `https://okutoon.com/.../tur <redacted query values: sira and sayfa>` to `https://okutoon.net/.../tur <redacted query values: sira and sayfa>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
