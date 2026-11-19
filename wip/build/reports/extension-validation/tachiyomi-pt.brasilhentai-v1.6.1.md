# Extension Validation Report

- Extension: tachiyomi-pt.brasilhentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8020430975962445741
- Source name: Brasil Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Quem Dera Eu Tivesse Transado Com Aquele Cara Só Uma Vez (`.../quem-dera-eu-tivesse-transado-com-aquele-cara-so-uma-vez`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Quem Dera Eu Tivesse Transado Com Aquele Cara Só Uma Vez (`.../quem-dera-eu-tivesse-transado-com-aquele-cara-so-uma-vez`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 8 | Recepção da Torre Residencial: Atendimento em Andamento 2 (`.../recepcao-da-torre-residencial-atendimento-em-andamento-2`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | Dando uma Ajudinha para o Sogro (`.../dando-uma-ajudinha-para-o-sogro`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Quem Dera Eu Tivesse Transado Com Aquele Cara Só Uma Vez (`.../quem-dera-eu-tivesse-transado-com-aquele-cara-so-uma-vez`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../quem-dera-eu-tivesse-transado-com-aquele-cara-so-uma-vez`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 7 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://brasilhentai.com/.../Quem-Dera-Eu-CAPA.jpg` (image/jpeg, 33969 bytes, 600x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../quem-dera-eu-tivesse-transado-com-aquele-cara-so-uma-vez` |  |  |  |
| details thumbnail URL | PASS | `https://brasilhentai.com/.../Quem-Dera-Eu-CAPA.jpg` |  |  |  |
| details author | PASS | ichigo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Miyoshi, um entusiasta submisso de trens, e Takano, uma mulher alta com físico atlético e clitóris hipertrofiado, acabam se aproximando de uma forma que nenhum dos dois imaginava. Postagens relacionadas: Comendo aquele cu gostoso Transado com veio safado A cara de puta da minha mãe De santinha ela só tem a cara! Com a cara de frente pro pauzão Não Tem Como Um Cara Impopular Como Eu, Recusar Um Convite Desses Não Tem Como Um Cara Impopular Como Eu, Recusar Um Convite Desses 2 A História da Pessoa Que Eu Achava Ser Um Cara na Rede Social Não Tem Como Um Cara Impopular Como Eu, Recusar Um Convite Desses 3 Uma Conversa Com Minha Tia, Com Quem Voltei a Me Encontrar Depois de Vários Anos |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://brasilhentai.com/.../1` to `https://brasilhentai.com` (1 redirects); popular: `https://brasilhentai.com/.../1` to `https://brasilhentai.com/.../3d-hentai-hd` (1 redirects); popular: `https://brasilhentai.com/.../2` to `https://brasilhentai.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://brasilhentai.com/.../Quem-Dera-Eu-01.jpg` (image/jpeg, 125503 bytes, 900x1200) |  |  |  |
