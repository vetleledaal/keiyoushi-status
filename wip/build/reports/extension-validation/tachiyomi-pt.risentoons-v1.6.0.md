# Extension Validation Report

- Extension: tachiyomi-pt.risentoons-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4905131080278546043
- Source name: Risentoons
- Source language: pt-BR
- Selected manga input: popular offset 0: Kimi no Koto ga Dai Dai Dai Dai Daisuki na 100-nin no Kanojo (`.../kimi-no-koto-ga-dai-dai-dai-dai-daisuki-na-100-nin-no-kanojo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Kimi no Koto ga Dai Dai Dai Dai Daisuki na 100-nin no Kanojo (`.../kimi-no-koto-ga-dai-dai-dai-dai-daisuki-na-100-nin-no-kanojo`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 22 | Psyche Matashitemo (`.../psyche-matashitemo`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Kaoru Hana wa Rin to Saku (`.../kaoru-hana-wa-rin-to-saku`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 22 | Amigo de Infância do Zênite (`.../amigo-de-infancia-do-zenite`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kimi no Koto ga Dai Dai Dai Dai Daisuki na 100-nin no Kanojo (`.../kimi-no-koto-ga-dai-dai-dai-dai-daisuki-na-100-nin-no-kanojo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kimi no Koto ga Dai Dai Dai Dai Daisuki na 100-nin no Kanojo (`.../kimi-no-koto-ga-dai-dai-dai-dai-daisuki-na-100-nin-no-kanojo`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 227 | Capítulo 01 (`.../read <redacted query values: chapter>`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 88 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kimi no Koto ga Dai Dai Dai Dai Daisuki na 100-nin no Kanojo, URL=`kimi-no-koto-ga-dai-dai-dai-dai-daisuki-na-100-nin-no-kanojo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 93/93 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 93/93 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://risentoons.xyz/.../d4521ec0-6834-4679-a52b-e7d2e51b2e7e.webp <redacted query values: v>` (image/webp (encoding: lossy), 200226 bytes, 848x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `kimi-no-koto-ga-dai-dai-dai-dai-daisuki-na-100-nin-no-kanojo` |  |  |  |
| details thumbnail URL | PASS | `https://risentoons.xyz/.../d4521ec0-6834-4679-a52b-e7d2e51b2e7e.webp <redacted query values: v>` |  |  |  |
| details author | PASS | Nakamura Rikito |  |  |  |
| details artist | PASS | Nozawa Yukiko |  |  |  |
| details genres | PASS | SOBRENATURAL, SEINEN, VIDA ESCOLAR, COMÉDIA, ROMANCE, SLICE OF LIFE, HARÉM |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Aijou é um garoto que tem muito azar no amor e já foi rejeitado mais de 100 vezes. Desesperado ele vai num templo pedir ajuda aos deuses. E seu desejo foi atendido, para cada rejeição ele terá uma alma gêmea. Mas isso se tona uma maldição quando ele fica sabendo que se elas não forem felizes ao lado de sua alma gêmea, ele, elas vão morrer… Mas que merda, você ainda está lendo isso? Não escutou? São 100 garotas, 100! Não há tempo a perder!<br><br>Nomes alternativos:<br>• The 100 Girlfriends Who Really, Really, Really, Really, Really Love You<br>• As 100 Namoradas que te Amam Muito, Muito, Muito, Muito, Muito, Mesmo.<br>• 君のことが大大大大大好きな100人の彼女<br>• 100 Cô Bạn Gái Này Rất, Rất, Rất, Rất, Rất Là Yêu Tôi Đó |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 227 chapters |  |  |  |
| chapter dates | PASS | 227 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 88 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://risentoons.xyz/.../35137ab3-6b81-45f0-9c26-0f42f591a035.webp <redacted query values: exp and sig>` (image/webp (container: extended), 170172 bytes, 800x930) |  |  |  |
