# Extension Validation Report

- Extension: tachiyomi-pt.mangaonline-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2253598980094211710
- Source name: Manga Online
- Source language: pt-BR
- Selected manga input: popular offset 0: Suba de Nível através da Luxúria (`.../suba-de-nivel-atraves-da-luxuria`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Suba de Nível através da Luxúria (`.../suba-de-nivel-atraves-da-luxuria`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | O Bastardo da Clave da Espada: Regressão ao Trono (`.../o-bastardo-da-clave-da-espada-regressao-ao-trono`) |  | 10s+ |
| latest | `getLatestUpdates(1)` | success | 24 | The Legendary Hero is an Academy Honors Student (`.../the-legendary-hero-is-an-academy-honors-student`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | success | 24 | Reencarnação do Deus Demônio (`.../reencarnacao-do-deus-demonio`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Suba de Nível através da Luxúria (`.../suba-de-nivel-atraves-da-luxuria`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Suba de Nível através da Luxúria (`.../suba-de-nivel-atraves-da-luxuria`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 63 | Capítulo 1 (`.../suba-de-nivel-atraves-da-luxuria-capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 34 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Suba de Nível através da Luxúria, URL=`.../suba-de-nivel-atraves-da-luxuria` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaonline.love/.../cover-001-cda98979.webp` (image/webp (encoding: lossy), 47990 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../suba-de-nivel-atraves-da-luxuria` |  |  |  |
| details thumbnail URL | PASS | `https://mangaonline.love/.../cover-001-cda98979.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Jesse renasce em um mundo onde as mulheres são dominantes e caçadores homens são uma raridade absoluta. Após despertar como um “Gestor de Luxúria de Caçadoras”, ele descobre um método ultrajante para ficar mais forte: ele precisa satisfazer as frustrações das caçadoras e ganhar pontos através do sexo. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 63 chapters |  |  |  |
| chapter dates | PASS | 63 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangaonline.love/.../page-001-442f60e4.webp` (image/webp (encoding: lossy), 234864 bytes, 720x3895) |  |  |  |
