# Extension Validation Report

- Extension: tachiyomi-es.mangako-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3063929815351969628
- Source name: MangaKo
- Source language: es
- Selected manga input: popular offset 0: Loca por los uniformes (`.../55`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Loca por los uniformes (`.../55`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | El chico que me gusta no es un chico (`.../43`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 13 | Mitame to Urahara (`.../45`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 5 | Battle Spirits: Shounen Toppa Bashin (`.../105`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Loca por los uniformes (`.../55`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Loca por los uniformes (`.../55`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | Capítulo 1 (`.../481`) |  | <1s |
| pages | `getPageList(chapter)` | success | 42 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Loca por los uniformes, URL=`.../55` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Mitame to Urahara, URL=`.../45` at page 1 offset 0 and page 2 offset 1, title=Genio Top Idol, URL=`.../30` at page 1 offset 10 and page 2 offset 3, title=Loca por los uniformes, URL=`.../55` at page 1 offset 12 and page 2 offset 2 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.mangako.xyz/.../1792011616.jpg` (image/webp (encoding: lossy), 65264 bytes, 747x1121) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../55` |  |  |  |
| details thumbnail URL | PASS | `https://images.mangako.xyz/.../1792011616.jpg` |  |  |  |
| details author | PASS | Anonymous |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Romance, Drama, Harem Inverso |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 10 (2)<br><br>La obsesión por los uniformes de Seolbok es una descarada fetichista de los uniformes, y el mundo entero es su patio de juegos. Todo comienza con un encuentro apasionado en una base militar, y a partir de ahí se embarca en una serie de aventuras episódicas por todo tipo de profesiones imaginables. Con un encanto atrevido y sin una pizca de vergüenza, se lanza de lleno a encuentros subidos de tono para seducir a todos y cada uno de los hombres uniformados y descubrir qué esconden debajo de sus uniformes.<br><br>**Scans:** Elixir Scan |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.mangako.xyz/.../01792011698.jpg <redacted query values: X-Amz-Content-Sha256, X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-SignedHeaders, X-Amz-Expires, and X-Amz-Signature>` (image/webp (encoding: lossy), 50618 bytes, 1080x2636) |  |  |  |
