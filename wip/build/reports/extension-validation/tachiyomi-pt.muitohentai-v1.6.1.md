# Extension Validation Report

- Extension: tachiyomi-pt.muitohentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1062606379654091909
- Source name: Muito Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Shota Teitoku e Hora de Nyuukyo (Kantai Collection) (`.../shota-teitoku-to-nyuukyo-time-portugues`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Shota Teitoku e Hora de Nyuukyo (Kantai Collection) (`.../shota-teitoku-to-nyuukyo-time-portugues`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Kunoichi Humilhada (Dead or Alive) (`.../nyuujoku-kunoichi-portugues`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Shizue Sonoato. (`.../shizue-sonoato-portugues`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Meu Relacionamento Secreto Com Minha Professora Peituda (`.../ore-to-kyonyuu-tannin-kyoushi-no-himitsu-no-kankei-portugues`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Shota Teitoku e Hora de Nyuukyo (Kantai Collection) (`.../shota-teitoku-to-nyuukyo-time-portugues`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shota Teitoku e Hora de Nyuukyo (Kantai Collection) (`.../shota-teitoku-to-nyuukyo-time-portugues`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shota Teitoku e Hora de Nyuukyo (Kantai Collection), URL=`.../shota-teitoku-to-nyuukyo-time-portugues` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://mangaz.muitohentai.club/.../shota-teitoku-to-nyuukyo-time-portugues.jpg` -> 2 manga URLs (examples: `.../shota-teitoku-to-nyuukyo-time-portugues`, `.../shota-teitoku-to-nyuukyo-time-portugues`), `https://mangaz.muitohentai.club/.../shizue-sonoato-portugues.jpg` -> 2 manga URLs (examples: `.../shizue-sonoato-portugues`, `.../shizue-sonoato-portugues`), `https://mangaz.muitohentai.club/.../sokuhame-bitchinpo-in-summer-portugues.jpg` -> 2 manga URLs (examples: `.../sokuhame-bitchinpo-in-summer-portugues`, `.../sokuhame-bitchinpo-in-summer-portugues`), `https://mangaz.muitohentai.club/.../shuryou-seikatsu-portugues.jpg` -> 2 manga URLs (examples: `.../shuryou-seikatsu-portugues`, `.../shuryou-seikatsu-portugues`), `https://mangaz.muitohentai.club/.../yamashiro-ren-portugues.jpg` -> 2 manga URLs (examples: `.../yamashiro-ren-portugues`, `.../yamashiro-ren-portugues`), `https://mangaz.muitohentai.club/.../tsuma-ni-mosaic-portugues.jpg` -> 2 manga URLs (examples: `.../tsuma-ni-mosaic-portugues`, `.../tsuma-ni-mosaic-portugues`), `https://mangaz.muitohentai.club/.../toratone-portugues.jpg` -> 2 manga URLs (examples: `.../toratone-portugues`, `.../toratone-portugues`), `https://mangaz.muitohentai.club/.../touka-san-wa-ore-no-koibito-portugues.jpg` -> 2 manga URLs (examples: `.../touka-san-wa-ore-no-koibito-portugues`, `.../touka-san-wa-ore-no-koibito-portugues`), `https://mangaz.muitohentai.club/.../amihsak-noswal-portugues.jpg` -> 2 manga URLs (examples: `.../amihsak-noswal-portugues`, `.../amihsak-noswal-portugues`), `https://mangaz.muitohentai.club/.../akigumo-sensei-no-usuihon-portugues.jpg` -> 2 manga URLs (examples: `.../akigumo-sensei-no-usuihon-portugues`, `.../akigumo-sensei-no-usuihon-portugues`), `https://mangaz.muitohentai.club/.../fascinate-nail-portugues.jpg` -> 2 manga URLs (examples: `.../fascinate-nail-portugues`, `.../fascinate-nail-portugues`), `https://mangaz.muitohentai.club/.../chijo-monogatari-henshitsusha-onna-shutsubotsu-chuu-portugues.jpg` -> 2 manga URLs (examples: `.../chijo-monogatari-henshitsusha-onna-shutsubotsu-chuu-portugues`, `.../chijo-monogatari-henshitsusha-onna-shutsubotsu-chuu-portugues`), `https://mangaz.muitohentai.club/.../chiiku-gangu-portugues.jpg` -> 2 manga URLs (examples: `.../chiiku-gangu-portugues`, `.../chiiku-gangu-portugues`), `https://mangaz.muitohentai.club/.../garens-bitches-2-portugues.jpg` -> 2 manga URLs (examples: `.../garens-bitches-2-portugues`, `.../garens-bitches-2-portugues`), `https://mangaz.muitohentai.club/.../gxg-l-the-series-young-boy-revenge-portugues.jpg` -> 2 manga URLs (examples: `.../gxg-l-the-series-young-boy-revenge-portugues`, `.../gxg-l-the-series-young-boy-revenge-portugues`), `https://mangaz.muitohentai.club/.../in-ka-inga-kangoku-no-onna-goroshiya-portugues.jpg` -> 2 manga URLs (examples: `.../in-ka-inga-kangoku-no-onna-goroshiya-portugues`, `.../in-ka-inga-kangoku-no-onna-goroshiya-portugues`), `https://mangaz.muitohentai.club/.../kamenkei-joshi-portugues.jpg` -> 2 manga URLs (examples: `.../kamenkei-joshi-portugues`, `.../kamenkei-joshi-portugues`), `https://mangaz.muitohentai.club/.../kanojo-no-okashita-ayamachi-portugues.jpg` -> 2 manga URLs (examples: `.../kanojo-no-okashita-ayamachi-portugues`, `.../kanojo-no-okashita-ayamachi-portugues`), `https://mangaz.muitohentai.club/.../kokoro-ore-mesu-ochiru-portugues.jpg` -> 2 manga URLs (examples: `.../kokoro-ore-mesu-ochiru-portugues`, `.../kokoro-ore-mesu-ochiru-portugues`), `https://mangaz.muitohentai.club/.../musume-no-class-no-iinchou-wa-papa-ga-hoshii-rashii-portugues.jpg` -> 2 manga URLs (examples: `.../musume-no-class-no-iinchou-wa-papa-ga-hoshii-rashii-portugues`, `.../musume-no-class-no-iinchou-wa-papa-ga-hoshii-rashii-portugues`), `https://mangaz.muitohentai.club/.../merry-sex-so-much-portugues.jpg` -> 2 manga URLs (examples: `.../merry-sex-so-much-portugues`, `.../merry-sex-so-much-portugues`), `https://mangaz.muitohentai.club/.../nikuhisyo-yukiko-1-portugues.jpg` -> 2 manga URLs (examples: `.../nikuhisyo-yukiko-1-portugues`, `.../nikuhisyo-yukiko-1-portugues`), `https://mangaz.muitohentai.club/.../nikuhisyo-yukiko-2-portugues.jpg` -> 2 manga URLs (examples: `.../nikuhisyo-yukiko-2-portugues`, `.../nikuhisyo-yukiko-2-portugues`), `https://mangaz.muitohentai.club/.../nikuhisyo-yukiko-chapter-portugues.jpg` -> 2 manga URLs (examples: `.../nikuhisyo-yukiko-chapter-portugues`, `.../nikuhisyo-yukiko-chapter-portugues`) |  |  |  |
| thumbnail | PASS | `https://mangaz.muitohentai.club/.../shota-teitoku-to-nyuukyo-time-portugues.jpg` (image/webp (encoding: lossy), 115942 bytes, 848x1200; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shota-teitoku-to-nyuukyo-time-portugues` |  |  |  |
| details thumbnail URL | PASS | `https://mangaz.muitohentai.club/.../shota-teitoku-to-nyuukyo-time-portugues.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Grupo, Harém, Meia Calça, Militar, Paródia, Peitos Grandes, S1 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Sem sinopse por enquanto. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.muitohentai.com/.../2` to `https://www.muitohentai.com/.../2` (2 redirects); popular: `https://www.muitohentai.com/.../capitulo-1` to `https://www.muitohentai.com/.../capitulo-1` (2 redirects); popular: `https://www.muitohentai.com/.../2` to `https://www.muitohentai.com/.../2` (2 redirects) |  |  |  |
| page load | PASS | `https://mangaz.muitohentai.club/.../2.jpg <redacted query values: nocache43>` (image/webp (encoding: lossy), 244432 bytes, 837x1200; server Content-Type: image/jpeg) |  |  |  |
