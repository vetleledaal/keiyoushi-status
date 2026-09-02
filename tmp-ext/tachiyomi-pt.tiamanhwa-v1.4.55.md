# Extension Validation Report

- Extension: tachiyomi-pt.tiamanhwa-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 0
- Warnings: 3
- Skipped: 3
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8823653003339002799
- Source name: Tia Manhwa
- Source language: pt-BR
- Selected manga input: latest offset 0: Amor de Cheerleader (`.../amor-de-cheerleader`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 0 |  |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 16 | Amor de Cheerleader (`.../amor-de-cheerleader`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 19 | O Segredo da Mulher Casada (`.../o-segredo-da-mulher-casada`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Amor de Cheerleader (`.../amor-de-cheerleader`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Amor de Cheerleader (`.../amor-de-cheerleader`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 19 | Capítulo 1 (`https://tiamanhwa.com/.../capitulo-1 <redacted query values: style>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Amor de Cheerleader, URL=`.../amor-de-cheerleader` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 36/36 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 36/36 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://tiamanhwa.com/.../dflazy.jpg` -> all 16 manga URLs (examples: `.../amor-de-cheerleader`, `.../tum-tum-s-matching`, `.../a-conta-secreta-do-professor`) |  |  |  |
| thumbnail | FAIL | `https://tiamanhwa.com/.../dflazy.jpg` (image/jpeg, 695 bytes, 1x1); image is solid or nearly solid (pixel colors vary by at most 0 on the 0-255 RGB scale; fails at 8 or less) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../amor-de-cheerleader` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tiamanhwa.com/.../Cheer-Love-manhwa.webp` (image/webp (container: extended), 66278 bytes, 500x700) |  |  |  |
| details author | PASS | Lee Ji-keung |  |  |  |
| details artist | PASS | Seong-su |  |  |  |
| details genres | PASS | Bunda Grande, Grupo, Harém, Peitos Grandes, Esportes, Fetiche, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mondori, um ex-astro do beisebol lesionado, agora trabalha como mascote do time. Ele achava que sua vida escolar tinha acabado, mas não percebeu os olhares secretos das deusas da escola olhando para ele?! As deusas que procuram um homem com forte capacidade física! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | PASS | 19 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 19 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://tiamanhwa.com/.../imagem_001.webp` (image/webp (encoding: lossy), 772826 bytes, 720x9515) |  |  |  |
